
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object homeMain extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.17*/("""

<!DOCTYPE html>
<html>
    <head>
        <title>Snowbound Regression Testing Overview</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*7.119*/(""""> 
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*8.70*/routes/*8.76*/.Assets.at("stylesheets/main.css"))),format.raw/*8.110*/(""""> 
    
	</head>
    <body>
        
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq[Any](/*15.27*/routes/*15.33*/.Application.index())),format.raw/*15.53*/("""">
                    Snowbound Regression Testing Overview
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq[Any](/*22.14*/content)),format.raw/*22.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(content:Html): play.api.templates.Html = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 19 17:13:44 EST 2013
                    SOURCE: C:/tmp/myregressionsite/app/views/homeMain.scala.html
                    HASH: 7f36283abd467543c040a335462ff30e100b8f8a
                    MATRIX: 724->1|816->16|1023->188|1037->194|1102->237|1211->311|1225->317|1281->351|1450->484|1465->490|1507->510|1718->685|1747->692
                    LINES: 26->1|29->1|35->7|35->7|35->7|36->8|36->8|36->8|43->15|43->15|43->15|50->22|50->22
                    -- GENERATED --
                */
            