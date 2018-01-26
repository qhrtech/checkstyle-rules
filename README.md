# QHR Style Guide Version 2

## Installation Instructions

### IntelliJ and NetBeans
Set up your IDE to automatically format code according to convention. See the Confluence document "Set Up Code Styles in IDEs"
https://confluence.qhrtech.com/x/CgF4Ag

### Checkstyle Configuration
Enforce conventions for coding styles. See the Confluence document "Set up Checkstyle for a Project"
https://confluence.qhrtech.com/x/EgF4Ag


## File Descriptions
- src/main/resources - Contains checkstyle xml configurations
    - google_checks_qhr_strict.xml - The official Google Style Guide
    - google_checks_qhr_transitional.xml - A less strict verion of the Google Style Guide meant to facilitate the transition between QHR Style Guide 1.0 and Google Style Guide
    - qhr-checkstyle.xml - QHR Style Guide 1.0 (Deprecated)
- checkstyleProfile.xml - A snippet from pom.xml to add checkstyle to a project
- netbeansConfiguration.xml - A snippet from pom.xml to add code styles (formatting) to a project
- intellij_codestyle_qhr.xml - IntelliJ code style schema, must be imported and applied to projects
- pom.xml - The maven project file to build checkstyle jars
