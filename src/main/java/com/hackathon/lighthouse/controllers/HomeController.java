package com.hackathon.lighthouse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackathon.lighthouse.formbeans.EnrolmentFormBean;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@ModelAttribute("command")
	private EnrolmentFormBean createBlankBean(){
		return new EnrolmentFormBean();
	}

	@RequestMapping
	public String home(){
		return "home";
	}
	@RequestMapping("/home2")
	public String home2(){
		return "home2";
	}
	
	
	@RequestMapping("/user/details")
	public @ResponseBody String mockUserDetails(){
		return "{\"nonSecure\":false,\"shortName\":\"G a 13\",\"points\":null,\"partner\":null,\"name\":\"GLO003315 account 139\",\"activeLanguage\":{\"languageIso\":\"en\",\"languageSsoLocale\":\"en_GB\"},\"market\":\"uk\",\"languages\":[\"en\"],\"product\":\"Platinum\"}";
	}
	
	@RequestMapping("/home/service")
	public @ResponseBody String mockHomeService(){
		return "{\"hero\":[{\"image\":\"https://qicm.americanexpress.com/Internet/IntlPremiumSites/Platinum/uk/en/HomePage/Images/PWT_May15_Amazon_745x268.jpg\",\"header\":\"Shop with Points at Amazon.co.uk\",\"copy\":\"From books to laptops, you can now use Membership Rewards<sup>®</sup> points to pay for eligible items at Amazon.co.uk. Terms apply.\",\"link\":\"https://www.amazon.co.uk/gp/shopwithpoints/marketing.html?inc=swpamexukmr&pr=swpamexukmr&plattr=vanamexuk1309\",\"cta\":\"More information\",\"color\":\"GREY\",\"subHeader\":null},{\"image\":\"https://qicm.americanexpress.com/Internet/IntlPremiumSites/Platinum/uk/en/Offers/Images/PWT_May15_Marina_745x268.jpg\",\"header\":\"Complimentary Tea for Two with Marina Rinaldi\",\"copy\":\"Enjoy a VIP personal styling experience for you and a friend, with afternoon tea and an exclusive gift. Spaces are limited.\",\"link\":\"/benefits/secure/platinum/uk/en/#/offers/lifestyle/tcm:617-1078549\",\"cta\":\"More information\",\"color\":\"GREY\",\"subHeader\":null},{\"image\":\"https://qicm.americanexpress.com/Internet/IntlPremiumSites/Platinum/uk/en/Offers/Images/PWT_Dec14_Boingo_745x268.jpg\",\"header\":\"Complimentary Wi-Fi access at Boingo Hotspots Worldwide\",\"copy\":\"You can enjoy complimentary, unlimited Wi-Fi access with the Boingo American Express<sup>®</sup> Preferred Plan at more than 1 million Boingo Hotspots worldwide.\",\"link\":\"/benefits/secure/platinum/uk/en/#/benefitsdirectory/tcm:617-1005215\",\"cta\":\"More information\",\"color\":\"TEAL\",\"subHeader\":null},{\"image\":\"https://qicm.americanexpress.com/Internet/IntlPremiumSites/Platinum/uk/en/HomePage/Images/Dining%201028x310.jpg\",\"header\":\"Extra Cards for family and friends\",\"copy\":\"Those around you can be part of Platinum too. You can apply for a complimentary Platinum Card and up to four complimentary extra Cards for your family or others close to you.<br />\",\"link\":\"https://www252.americanexpress.com/inga3/uk/pers/ia/begin.do?perform=IntlEapp:UK:plat_chg_sup\",\"cta\":\"Request Supplementary Cards\",\"color\":\"GREEN\",\"subHeader\":null}],\"crossSellSmall\":[{\"image\":\"https://qicm.americanexpress.com/Internet/IntlPremiumSites/Platinum/uk/en/HomePage/Images/Videos.jpg\",\"header\":\"Benefits Directory\",\"copy\":\"From complimentary culinary delights and exclusive events to airport lounge access, room upgrades and comprehensive worldwide travel insurance. You’ll find all of your benefits here.<br />\",\"link\":\"/benefits/secure/platinum/uk/en/#/benefitsdirectory\",\"cta\":\"Go to Benefits Directory\",\"color\":\"GREEN\",\"subHeader\":null},{\"image\":\"https://qicm.americanexpress.com/Internet/IntlPremiumSites/Platinum/uk/en/HomePage/Images/PL_Home_PlatinumEvents_210x118.jpg\",\"header\":\"Platinum Events\",\"copy\":\"Platinum opens doors to a range of memorable experiences, including a selection created exclusively for Platinum Cardmembers.\",\"link\":\"/benefits/secure/platinum/uk/en/#/offers/lifestyle\",\"cta\":\"See events\",\"color\":\"GREEN\",\"subHeader\":null},{\"image\":\"https://qicm.americanexpress.com/Internet/IntlPremiumSites/Platinum/uk/en/HomePage/Images/Recommend%20a%20Friend.jpg\",\"header\":\"Recommend a friend\",\"copy\":\"When someone you recommend becomes a Cardmember, we'll add 18,000 Membership Rewards points to your account. Plus, we'll get your friend started with 35,000 bonus points of their own.\",\"link\":\"https://www.americanexpress.com/uk/mgm/referafriendplatinumcharge.cgi?sourcecode=M00200XB03\",\"cta\":\"Recommend a friend. Earn 18,000 Membership Rewards points.\",\"color\":\"GREEN\",\"subHeader\":null},{\"image\":\"https://qicm.americanexpress.com/Internet/IntlPremiumSites/images/Travel%2017-210.jpg\",\"header\":\"Platinum Travel Offers\",\"copy\":\"Explore the latest travel offers, including a selection created exclusively for Platinum Cardmembers.\",\"link\":\"/benefits/secure/platinum/uk/en/#/offers/travel\",\"cta\":\"Explore offers\",\"color\":\"GREEN\",\"subHeader\":null}],\"crossSellLarge\":[]}";
	}
	
	@RequestMapping("/home")
	public String homeRipoff(){
		return "wtHome";
	}
	
}
