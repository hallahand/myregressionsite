
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
object homeSkeleton extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*3.2*/(content: Html):play.api.templates.Html = {
        _display_ {
def /*6.2*/linkTo/*6.8*/( route: String ) = {{
	if(route == "New") {
		routes.NewRun.newRun()
	}
	else if(route == "Import"){
		routes.Application.importRun()
	}
	else if(route == "Overview") {
		routes.Application.overview()
		}
	else if(route == "Runs") {
		routes.Application.runIndex()
		}
	else if(route == "Bugs") {
		routes.Application.listBug()
		}
	else if(route == "Pages") {
		routes.Application.listPage()
		}
	else {
		routes.Application.overview()
	}
 
}};
Seq[Any](format.raw/*3.17*/("""


"""),format.raw/*29.2*/("""
<!DOCTYPE html>
<html>
	<link rel="icon" type="image/png" href=""""),_display_(Seq[Any](/*32.43*/routes/*32.49*/.Assets.at("images/snowbound.png"))),format.raw/*32.83*/("""">

<head>
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*35.51*/routes/*35.57*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*35.100*/("""">
    <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*36.66*/routes/*36.72*/.Assets.at("stylesheets/main.css"))),format.raw/*36.106*/(""""> 
	<link type = "text/css" rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*37.65*/routes/*37.71*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*37.110*/("""" >
	
	<script type="text/javascript" src=""""),_display_(Seq[Any](/*39.39*/routes/*39.45*/.Application.javascriptRoutes())),format.raw/*39.76*/(""""></script>
</head>
<title>Regression Database Overview</title>
<body>
<div class="navbar-outer">
<div class="navbar navbar-inverse navbar-fixed-top">
 <div class="navbar-inner">
	<a class="brand" href=""""),_display_(Seq[Any](/*46.26*/linkTo("Overview"))),format.raw/*46.44*/(""" ">Regression Database</a>
   <ul class = nav nav-tabs>
  	    <li class="divider-vertical"></li>
   		<li><a href = """"),_display_(Seq[Any](/*49.22*/linkTo("New"))),format.raw/*49.35*/(""" " >New Regression Run</a></li>
   		<li class="divider-vertical"></li>
   		<li><a href = """"),_display_(Seq[Any](/*51.22*/linkTo("Import"))),format.raw/*51.38*/(""" " >Import Regression Data</a></li> 
   		
   	
       
   		
   </ul>
           <ul class="nav">
    <li class="dropdown">
		<a href="#" class="dropdown-toggle" data-toggle="dropdown">
			Quick Links
		</a>
		<ul class="dropdown-menu">
			<li><a href = """"),_display_(Seq[Any](/*63.20*/linkTo("Runs"))),format.raw/*63.34*/(""" ">View all Runs</a></li>
			<li><a href = """"),_display_(Seq[Any](/*64.20*/linkTo("Pages"))),format.raw/*64.35*/(""" " >View all Pages</a></li>
			<li><a href = """"),_display_(Seq[Any](/*65.20*/linkTo("Bugs"))),format.raw/*65.34*/(""" " >View all Bugs</a></li>
		</ul>
    </li>
    </ul>
 <form class="navbar-search pull-left" name ="filter" onsubmit ="return search()">  
   	<input type="text" id = "searchbox" class="search-query" placeholder="Search by Run Name" />  
 	
 </form> 
   

   </div>
   </div>
  </div>
  
 
<script>
 function search() """),format.raw/*81.20*/("""{"""),format.raw/*81.21*/("""
	// <input type = "submit" style="visibility: hidden" onsubmit = "search()"/>
     var textInput = document.getElementById("searchbox").value;
    //alert("I am an alert box!");
    //window.location.href = 'http://www.google.com';
    window.location.href = jsRoutes.controllers.Application.listRun(0, "name","asc", textInput, "name").url;
	  return false;
"""),format.raw/*88.1*/("""}"""),format.raw/*88.2*/("""
 </script>  
  
<script src=""""),_display_(Seq[Any](/*91.15*/routes/*91.21*/.Assets.at("js/jquery.js"))),format.raw/*91.47*/(""""></script>
<script src=""""),_display_(Seq[Any](/*92.15*/routes/*92.21*/.Assets.at("js/bootstrap.js"))),format.raw/*92.50*/(""""></script>
<script src=""""),_display_(Seq[Any](/*93.15*/routes/*93.21*/.Assets.at("js/bootstrap-dropdown.js"))),format.raw/*93.59*/(""""></script>
<script src=""""),_display_(Seq[Any](/*94.15*/routes/*94.21*/.Assets.at("js/bootstrap.min.js"))),format.raw/*94.54*/(""""></script>
		<section id="main">
            """),_display_(Seq[Any](/*96.14*/content)),format.raw/*96.21*/("""
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
                    DATE: Thu Dec 19 12:19:51 EST 2013
                    SOURCE: C:/Users/dhallahan/workspace/regressionsiteRnd2-1/eclipse-regressionsite/app/views/homeSkeleton.scala.html
                    HASH: d8bef2e07721d3de8268cff1d479bd06cbf82b42
                    MATRIX: 728->5|803->27|816->33|1313->20|1346->500|1451->569|1466->575|1522->609|1622->673|1637->679|1703->722|1808->791|1823->797|1880->831|1985->900|2000->906|2062->945|2144->991|2159->997|2212->1028|2459->1239|2499->1257|2657->1379|2692->1392|2823->1487|2861->1503|3166->1772|3202->1786|3284->1832|3321->1847|3405->1895|3441->1909|3804->2244|3833->2245|4226->2611|4254->2612|4324->2646|4339->2652|4387->2678|4450->2705|4465->2711|4516->2740|4579->2767|4594->2773|4654->2811|4717->2838|4732->2844|4787->2877|4872->2926|4901->2933
                    LINES: 26->3|28->6|28->6|52->3|55->29|58->32|58->32|58->32|61->35|61->35|61->35|62->36|62->36|62->36|63->37|63->37|63->37|65->39|65->39|65->39|72->46|72->46|75->49|75->49|77->51|77->51|89->63|89->63|90->64|90->64|91->65|91->65|107->81|107->81|114->88|114->88|117->91|117->91|117->91|118->92|118->92|118->92|119->93|119->93|119->93|120->94|120->94|120->94|122->96|122->96
                    -- GENERATED --
                */
            