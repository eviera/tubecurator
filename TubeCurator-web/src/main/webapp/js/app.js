/* global angular: false */	

(function() {
	'use strict';
	
	var app = angular.module('tubeCurator', ['ngSanitize', 'ngResource', 'ngRoute']);
	
	app.config(['$routeProvider', function($routeProvider) {
		$routeProvider.
			when('/entries', {
				templateUrl: 'partials/entries.html',
				controller: 'TubeController'
			}).
			otherwise({
				redirectTo: '/entries'
			});
	}]);
	
	app.factory('TubeEntryService', ['$resource', function($resource) {
		return $resource('/tubecurator/rest/tubeentries/:id');
	}]);
	
	app.controller('TubeController', ['$scope', '$sce', 'TubeEntryService', function($scope, $sce, TubeEntryService) {
		var ctrl = this;
		ctrl.tubeEntries = TubeEntryService.query();
			
		$scope.trustSrc = function(src){
			return $sce.trustAsResourceUrl(src);
		};
		
	}]);
	
})();
