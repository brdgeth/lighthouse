package com.hackathon.lighthouse.controllers;

import java.util.Collection;
import java.util.Date;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackathon.lighthouse.documents.Enrolment;
import com.hackathon.lighthouse.formbeans.EnrolmentFormBean;
import com.hackathon.lighthouse.repository.EnrolmentRepository;

@Controller
@RequestMapping("/enrolments")
public class EnrolmentController {
	
	@Autowired
	private EnrolmentRepository enrolmentRepository;
	
	@Autowired
	private Mapper ooMapper;

	@RequestMapping(method=RequestMethod.POST)
	public String doEnrol(@ModelAttribute("command") @Valid EnrolmentFormBean enrolmentFormBean, BindingResult bindingResult){
		if (bindingResult.hasErrors()){
			return "home";
		}
		
		Enrolment enrolment = ooMapper.map(enrolmentFormBean, Enrolment.class);
		enrolment.setEnrolmentDateTime(new Date().toString());
		Enrolment saved = enrolmentRepository.save(enrolment);
		
		return "redirect:enrolments/"+saved.get_id();
	}
	
	@RequestMapping(value="/{id:[\\da-f]+}", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Enrolment enrolmentById(@PathVariable("id") String id){
		return enrolmentRepository.findOne(new ObjectId(id));
	}
	
	@RequestMapping(method=RequestMethod.GET, params="accountId")
	public @ResponseBody Collection<Enrolment> enrolmentsByAccountId(final @RequestParam("accountId") String accountId){
		return enrolmentRepository.findByAccountId(accountId);
	}
	
}
