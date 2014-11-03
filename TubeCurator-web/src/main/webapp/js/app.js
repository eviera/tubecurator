(function() {
	var app = angular.module('tubeCurator', ['ngSanitize', 'ngResource']);
	
	app.factory('TubeEntryService', ['$resource', function($resource) {
		return $resource('/tubecurator/rest/tube/entries',{}, {
			query: {method: 'GET', params:{}, isArray:true}
		});
	}]);
	
	app.controller('TubeController', ['$scope', '$sce', 'TubeEntryService', function($scope, $sce, TubeEntryService) {
		var ctrl = this;
		/*
		this.tubeEntries = [];
		$http.get('/tubecurator/rest/tube/all').success(function(data) {
			ctrl.tubeEntries = data; 
		}).error(function(data) {
			alert(data);
		});
		*/
		ctrl.tubeEntries = TubeEntryService.query();
			
		$scope.trustSrc = function(src){
			return $sce.trustAsResourceUrl(src);
		};
		
	}]);
	
})();
