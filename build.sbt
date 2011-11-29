scalaVersion := "2.9.1"

resolvers += "Local Maven Repository" at "file://" + (Path.userHome / ".m2" / "repository").absolutePath

externalPom()
