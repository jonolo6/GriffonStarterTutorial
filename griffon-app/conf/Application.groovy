application {
    title = 'GriffonStarterTutorial'
    startupGroups = ['griffon-starter-tutorial']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "griffon-starter-tutorial"
    'griffon-starter-tutorial' {
        model      = 'griffon.starter.tutorial.GriffonStarterTutorialModel'
        view       = 'griffon.starter.tutorial.GriffonStarterTutorialView'
        controller = 'griffon.starter.tutorial.GriffonStarterTutorialController'
    }

}
