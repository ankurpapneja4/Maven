## Maven Plugins

### ToDo : Always Clean Before `Compile` Or `Package`
1. Hook `maven-clean-plugin` to `Lifecycle: default` `Phase: initialize`  

### ToDo : Create Fat Jar 
2. Hook `maven-assembly-plugin` to `Lifecycle: default` `Phase: package` `PluginGoal: single`