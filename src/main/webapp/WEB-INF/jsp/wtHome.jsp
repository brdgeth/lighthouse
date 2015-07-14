
<div class="home-hero {{heroOnShow.color}}" ng-swipe-left="heroNext()" ng-swipe-right="heroPrevious()">
	<div class="StandardImage" data-img="{{heroOnShow.image}}" data-size="full-width-hero"></div>
	<div class="item HeroItem">
		<h1 id="homeHeroHeader" ng-bind-html="heroOnShow.header"></h1>
		<p ng-bind-html="heroOnShow.copy"></p>
		<a class="block-link" ng-if="heroOnShow.cta" ng-href="{{heroOnShow.link | secureURL:this}}" ng-bind-html="heroOnShow.cta"></a>
		
		<ul class="controls">
			<li ng-repeat="item in hero | limitTo:5">
				<span ng-click="heroJump($index)" class="{{item.onShow}}">&bull;</span>
			</li>
			<li class="divider"></li>
			<li class="toggle {{heroIsPlaying}}" ng-click="heroToggle()"></li>
		</ul>
	</div>
</div>

<div class="cross-sell-small" ng-swipe-left="crossSellSmallNext()" ng-swipe-right="crossSellSmallPrevious()" ng-class="{hasControls: crossSellSmall.length > 4}">
	<div class="controls" ng-show="crossSellSmall.length > 4">
		<span class="left" ng-click="crossSellSmallNext()"></span>
		<span class="right" ng-click="crossSellSmallPrevious()"></span>
	</div>
	<ul id="HM_crossSellSmall_ul">
		<li ng-repeat="item in crossSellSmall" ng-show="$index < 4">
			<div ng-if="item.image" class="StandardImage" data-img="{{item.image}}" data-size="thumbnail"></div>
			<h4 ng-if="item.subHeader" ng-bind-html="item.subHeader" class="cross-sell-sub-header"></h4>
			<h3 ng-bind-html="item.header"></h3>
			<p ng-bind-html="item.copy"></p>
			<a ng-href="{{item.link | secureURL:this}}" ng-bind-html="item.cta"></a>
		</li>
	</ul>
</div>

<ul class="cross-sell-large" ng-if="crossSellLarge.length" id="HM_crossSellLarge_ul">
	<li ng-repeat="item in crossSellLarge">
		<h3 ng-bind-html="item.header"></h3>
		<p ng-bind-html="item.copy"></p>
		<a ng-href="{{item.link | secureURL:this}}" ng-bind-html="item.cta"></a>
	</li>
</ul>