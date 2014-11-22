module.exports = function(grunt) {

  // Project configuration.
  grunt.initConfig({
    jshint: {
      all:['js/app.js']
    }
  });

  grunt.loadNpmTasks('grunt-contrib-jshint');

  // Default task(s).
  grunt.registerTask('default', ['jshint']);

};