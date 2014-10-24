(function() {
	var app = angular.module('tubeCurator', []);
	app.controller('TubeController', ['$http', function($http) {
		var ctrl = this;
		this.tubeEntries = [];
		$http.get('http://localhost:18080/tubecurator/rest/resttest/tito?pregunta=caca').success(function(data) {
			ctrl.tubeEntries = data; 
		}).error(function(data) {
			alert(data);
		});

	}]);
	
})();
