import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object CLI extends JavaModule {
    def scalaVersion = "2.13.1"

    def ivyDeps = Agg(
      ivy"javax.xml.bind:jaxb-api:2.3.1",
      ivy"org.bouncycastle:bcprov-jdk15on:1.65"
    )
}
