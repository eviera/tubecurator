module.exports = function(grunt) {

  require('time-grunt')(grunt);

  // Project configuration.
  grunt.initConfig({
  	pkg: grunt.file.readJSON('package.json'),
    jshint: {
		all:['js/app.js']
    },
    uglify: {
    	options: {
        	banner: '/*! <%= pkg.name %> <%= grunt.template.today("yyyy-mm-dd") %> */\n'
    	},
		build: {
			src: 'js/app.js',
			dest: 'js/app.min.js'
		}
	}
  });

  grunt.loadNpmTasks('grunt-contrib-jshint');
  grunt.loadNpmTasks('grunt-contrib-uglify');

  // Default task(s).
  grunt.registerTask('default', ['jshint','uglify']);

};