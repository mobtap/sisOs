grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

	inherits 'global'
	log 'warn'

	repositories {
		grailsCentral()
		mavenLocal()
		mavenCentral()
	}

	dependencies {
	}

	plugins {

		runtime ':jquery:1.10.2'

		build ':release:2.2.1', ':rest-client-builder:1.0.3', {
			export = false
		}
	}
}
