
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
object runData extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Run],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, dataForm: Form[Run]):play.api.templates.Html = {
        _display_ {
def /*3.2*/header/*3.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*3.38*/("""
    <th class=""""),_display_(Seq[Any](/*4.17*/key/*4.20*/.replace(".","_"))),format.raw/*4.37*/(""" header "headerSortUp"">
        <a href= >"""),_display_(Seq[Any](/*5.20*/title)),format.raw/*5.25*/("""</a>
    </th>
""")))};def /*9.5*/link/*9.9*/(input: Long, input2: String, direction:String, pageDir:String) = {{
    	if (direction == "download")
			routes.Application.pageExcel(input)	
		else if (direction == "pages") {
	    	routes.Application.listPageByRun(0,"name","asc",input, "", pageDir)
		}
		else {	
			routes.Application.listRun(0, "name", "asc", input2, direction)
		} 
		
    }};
Seq[Any](format.raw/*1.33*/("""

"""),format.raw/*7.2*/("""

   """),format.raw/*19.6*/("""


"""),_display_(Seq[Any](/*22.2*/homeSkeleton/*22.14*/ {_display_(Seq[Any](format.raw/*22.16*/("""
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*23.51*/routes/*23.57*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*23.100*/("""">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
        
        <center><h1>Info Regarding Run ID: """),_display_(Seq[Any](/*26.45*/id)),format.raw/*26.47*/("""</h1> </center>
        
        <table class="run zebra-striped">
            <thead>
                <tr>
                	"""),_display_(Seq[Any](/*31.19*/header("date.name", "Date"))),format.raw/*31.46*/("""
                    """),_display_(Seq[Any](/*32.22*/header("name", "Run Name"))),format.raw/*32.48*/("""
                    """),_display_(Seq[Any](/*33.22*/header("version.name", "Version"))),format.raw/*33.55*/("""
                    """),_display_(Seq[Any](/*34.22*/header("format.name", "Format"))),format.raw/*34.53*/("""
                    """),_display_(Seq[Any](/*35.22*/header("svn.num", "SVN"))),format.raw/*35.46*/("""
                    """),_display_(Seq[Any](/*36.22*/header("performance.time", "Performance Time"))),format.raw/*36.68*/("""
                    """),_display_(Seq[Any](/*37.22*/header("better", "# Better"))),format.raw/*37.50*/("""
                    """),_display_(Seq[Any](/*38.22*/header("worse", "# Worse"))),format.raw/*38.48*/("""
					"""),_display_(Seq[Any](/*39.7*/header("neutral", "# Neutral"))),format.raw/*39.37*/("""
                    """),_display_(Seq[Any](/*40.22*/header("bugs", "# Bugs"))),format.raw/*40.46*/("""
                    """),_display_(Seq[Any](/*41.22*/header("notdecompressed", "# Not Decompressed"))),format.raw/*41.69*/("""
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*46.18*/for(run <- Run.runByID(id)) yield /*46.45*/ {_display_(Seq[Any](format.raw/*46.47*/("""
                    <tr>
                    	<td>
                            """),_display_(Seq[Any](/*49.30*/if(run.date == null)/*49.50*/ {_display_(Seq[Any](format.raw/*49.52*/("""
                                <em>-</em>
                            """)))}/*51.31*/else/*51.36*/{_display_(Seq[Any](format.raw/*51.37*/("""
                                """),_display_(Seq[Any](/*52.34*/run/*52.37*/.date.name.format("dd MMM yyyy"))),format.raw/*52.69*/("""
                            """)))})),format.raw/*53.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*56.30*/if(run.name == null)/*56.50*/ {_display_(Seq[Any](format.raw/*56.52*/("""
                                <em>-</em>
                            """)))}/*58.31*/else/*58.36*/{_display_(Seq[Any](format.raw/*58.37*/("""
                                """),_display_(Seq[Any](/*59.34*/run/*59.37*/.name)),format.raw/*59.42*/("""
                            """)))})),format.raw/*60.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*63.30*/if(run.version == null)/*63.53*/ {_display_(Seq[Any](format.raw/*63.55*/("""
                                <em>-</em>
                            """)))}/*65.31*/else/*65.36*/{_display_(Seq[Any](format.raw/*65.37*/("""
                                """),_display_(Seq[Any](/*66.34*/run/*66.37*/.version.name)),format.raw/*66.50*/(""" of """),_display_(Seq[Any](/*66.55*/run/*66.58*/.version.platform.name)),format.raw/*66.80*/("""
                            """)))})),format.raw/*67.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*70.30*/if(run.svn == null)/*70.49*/ {_display_(Seq[Any](format.raw/*70.51*/("""
                                <em>-</em>
                            """)))}/*72.31*/else/*72.36*/{_display_(Seq[Any](format.raw/*72.37*/("""
                                """),_display_(Seq[Any](/*73.34*/run/*73.37*/.svn.num)),format.raw/*73.45*/("""
                            """)))})),format.raw/*74.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*77.30*/if(run.format.name == null)/*77.57*/ {_display_(Seq[Any](format.raw/*77.59*/("""
                                <em>-</em>
                            """)))}/*79.31*/else/*79.36*/{_display_(Seq[Any](format.raw/*79.37*/("""
                                """),_display_(Seq[Any](/*80.34*/run/*80.37*/.format.name)),format.raw/*80.49*/("""
                            """)))})),format.raw/*81.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*84.30*/if(run.performance == null)/*84.57*/ {_display_(Seq[Any](format.raw/*84.59*/("""
                                <em>-</em>
                            """)))}/*86.31*/else/*86.36*/{_display_(Seq[Any](format.raw/*86.37*/("""
                                """),_display_(Seq[Any](/*87.34*/run/*87.37*/.performance.time.format("hh:mm:ss"))),format.raw/*87.73*/("""
                            """)))})),format.raw/*88.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*91.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Better"))) == 0)/*91.127*/ {_display_(Seq[Any](format.raw/*91.129*/("""
                                <em>-</em>
                            """)))}/*93.31*/else/*93.36*/{_display_(Seq[Any](format.raw/*93.37*/("""
                                """),_display_(Seq[Any](/*94.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Better")))))),format.raw/*94.124*/("""
                            """)))})),format.raw/*95.30*/("""
                        </td>
                        <td>
                            """),_display_(Seq[Any](/*98.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Worse"))) == 0)/*98.126*/ {_display_(Seq[Any](format.raw/*98.128*/("""
                                <em>-</em>
                            """)))}/*100.31*/else/*100.36*/{_display_(Seq[Any](format.raw/*100.37*/("""
                                """),_display_(Seq[Any](/*101.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Worse")))))),format.raw/*101.123*/("""
                            """)))})),format.raw/*102.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*105.30*/if(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Neutral"))) == 0)/*105.128*/ {_display_(Seq[Any](format.raw/*105.130*/("""
                                <em>-</em>
                            """)))}/*107.31*/else/*107.36*/{_display_(Seq[Any](format.raw/*107.37*/("""
                                """),_display_(Seq[Any](/*108.34*/(Run.calculateDifferences(run,DiffType.getDiffTypeByID(DiffType.getDiffTypeID("Neutral")))))),format.raw/*108.125*/("""
                            """)))})),format.raw/*109.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*112.30*/if(Run.calculateBugs(run) == 0)/*112.61*/ {_display_(Seq[Any](format.raw/*112.63*/("""
                                <em>-</em>
                            """)))}/*114.31*/else/*114.36*/{_display_(Seq[Any](format.raw/*114.37*/("""
                                """),_display_(Seq[Any](/*115.34*/Run/*115.37*/.calculateBugs(run))),format.raw/*115.56*/("""
                            """)))})),format.raw/*116.30*/("""
                        </td>
						<td>
                            """),_display_(Seq[Any](/*119.30*/if(PageOut.getPagesNotDecompressed(run.id) == 0)/*119.78*/ {_display_(Seq[Any](format.raw/*119.80*/("""
                                <em>-</em>
                            """)))}/*121.31*/else/*121.36*/{_display_(Seq[Any](format.raw/*121.37*/("""
                                """),_display_(Seq[Any](/*122.34*/PageOut/*122.41*/.getPagesNotDecompressed(run.id))),format.raw/*122.73*/("""
                            """)))})),format.raw/*123.30*/("""
                        </td>
                        
                    </tr>
                

            </tbody>
        </table>
	
       <table class="Bug zebra-striped">
       		<center><h1>Bugs in Run ID: """),_display_(Seq[Any](/*133.39*/id)),format.raw/*133.41*/("""</h1> </center>
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*136.22*/header("number", "Bug Number"))),format.raw/*136.52*/("""
					"""),_display_(Seq[Any](/*137.7*/header("bugstatus.name", "Bug Status"))),format.raw/*137.45*/("""
					"""),_display_(Seq[Any](/*138.7*/header("difference.name", "Difference Desc"))),format.raw/*138.51*/(""" 
					"""),_display_(Seq[Any](/*139.7*/header("pagesoutbug.run.format.name", "Format"))),format.raw/*139.54*/("""
					"""),_display_(Seq[Any](/*140.7*/header("pagesoutbug.run.version.name", "Version"))),format.raw/*140.56*/("""
					"""),_display_(Seq[Any](/*141.7*/header("pagesoutbug.run.date.name", "Date Appeared"))),format.raw/*141.59*/("""					
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*146.18*/for(bug <- Bug.listBugs(run)) yield /*146.47*/ {_display_(Seq[Any](format.raw/*146.49*/("""
                    <tr>
                        <td>"""),_display_(Seq[Any](/*148.30*/bug/*148.33*/.number)),format.raw/*148.40*/("""</td>
						<td>
                            """),_display_(Seq[Any](/*150.30*/if(bug.bugstatus == null)/*150.55*/ {_display_(Seq[Any](format.raw/*150.57*/("""
                                <em>-</em>
                            """)))}/*152.31*/else/*152.36*/{_display_(Seq[Any](format.raw/*152.37*/("""
                                """),_display_(Seq[Any](/*153.34*/bug/*153.37*/.bugstatus.name)),format.raw/*153.52*/("""
                            """)))})),format.raw/*154.30*/("""
                        </td>
						<td>
							"""),_display_(Seq[Any](/*157.9*/for(difference <- Bug.getDifferences(bug)) yield /*157.51*/ {_display_(Seq[Any](format.raw/*157.53*/("""
								"""),_display_(Seq[Any](/*158.10*/if(difference.difftype.name == "Worse")/*158.49*/ {_display_(Seq[Any](format.raw/*158.51*/("""
									<font color="red">&bull; <i>"""),_display_(Seq[Any](/*159.39*/difference/*159.49*/.name)),format.raw/*159.54*/("""</i></font>  
								""")))}/*160.11*/else/*160.16*/{_display_(Seq[Any](format.raw/*160.17*/("""
									"""),_display_(Seq[Any](/*161.11*/if(difference.difftype.name == "Better")/*161.51*/ {_display_(Seq[Any](format.raw/*161.53*/("""
										<font color="green">&bull; <i>"""),_display_(Seq[Any](/*162.42*/difference/*162.52*/.name)),format.raw/*162.57*/("""</i></font>
									""")))}/*163.12*/else/*163.17*/{_display_(Seq[Any](format.raw/*163.18*/("""
										<font color="black">&bull; <i>"""),_display_(Seq[Any](/*164.42*/difference/*164.52*/.name)),format.raw/*164.57*/("""</i></font>
									""")))})),format.raw/*165.11*/("""
								""")))})),format.raw/*166.10*/("""
								
								</br>
							""")))})),format.raw/*169.9*/("""
                        </td>
						<td>
							"""),_display_(Seq[Any](/*172.9*/if(Bug.getFileFormat(bug) == null)/*172.43*/ {_display_(Seq[Any](format.raw/*172.45*/("""
								<em>-</em>
							""")))}/*174.10*/else/*174.15*/{_display_(Seq[Any](format.raw/*174.16*/("""
								"""),_display_(Seq[Any](/*175.10*/Bug/*175.13*/.getFileFormat(bug).name)),format.raw/*175.37*/("""
							""")))})),format.raw/*176.9*/("""
                        </td>
						<td>
							"""),_display_(Seq[Any](/*179.9*/if(Bug.getVersion(bug) == null)/*179.40*/ {_display_(Seq[Any](format.raw/*179.42*/("""
								<em>-</em>
							""")))}/*181.10*/else/*181.15*/{_display_(Seq[Any](format.raw/*181.16*/("""
								"""),_display_(Seq[Any](/*182.10*/Bug/*182.13*/.getVersion(bug).name)),format.raw/*182.34*/("""
							""")))})),format.raw/*183.9*/("""
                        </td>
						<td>
							"""),_display_(Seq[Any](/*186.9*/if(Bug.getDate(bug) == null)/*186.37*/ {_display_(Seq[Any](format.raw/*186.39*/("""
								<em>-</em>
							""")))}/*188.10*/else/*188.15*/{_display_(Seq[Any](format.raw/*188.16*/("""
								"""),_display_(Seq[Any](/*189.10*/Bug/*189.13*/.getDate(bug).name.format("dd MMM yyyy"))),format.raw/*189.53*/("""
							""")))})),format.raw/*190.9*/("""
                        </td>
                    </tr>
					
                """)))})),format.raw/*194.18*/("""

            </tbody>
        </table>
        
        <center>
        
        
		<div class="navbar ">

 <div class="navbar-inner">
	<a class="brand" >Run Options</a>
	 <ul class="nav">
    <li class="dropdown">
		<a href="#" class="dropdown-toggle" data-toggle="dropdown">
			Pages from this Run
			
		</a>
		
		<ul class="dropdown-menu">
			<li><a href =""""),_display_(Seq[Any](/*214.19*/link(run.id," ", "pages", "all"))),format.raw/*214.51*/(""" " >All Pages</a></li>
			<li><a href =""""),_display_(Seq[Any](/*215.19*/link(run.id," ", "pages", "better"))),format.raw/*215.54*/(""" " >Better Pages</a></li>
			<li><a href =""""),_display_(Seq[Any](/*216.19*/link(run.id," ", "pages", "worse"))),format.raw/*216.53*/(""" "  >Worse Pages</a></li>
			<li><a href = """"),_display_(Seq[Any](/*217.20*/link(run.id," ", "pages", "neutral"))),format.raw/*217.56*/(""" " >Neutral Pages</a></li>
			<li><a href = """"),_display_(Seq[Any](/*218.20*/link(run.id," ", "pages", "error"))),format.raw/*218.54*/(""" " >Pages with Errors</a></li>
		</ul>
    </li>
    </ul>
   <ul class = nav nav-tabs>
   		
  	    <li class="divider-vertical"></li>
   		<li><a href = """"),_display_(Seq[Any](/*225.22*/link(3, run.date.name, "date.name"," " ))),format.raw/*225.62*/(""" "  >Runs with Same Date </a></li>
   		<li class="divider-vertical"></li>
   		<li><a href = """"),_display_(Seq[Any](/*227.22*/link(3, run.version.name, "version.name"," " ))),format.raw/*227.68*/(""" "  >Runs with Same Version </a></li> 
   		<li class="divider-vertical"></li>
   		<li><a href = """"),_display_(Seq[Any](/*229.22*/link(3, run.format.name, "format.name"," " ))),format.raw/*229.66*/(""" "  >Runs with Same Format </a></li>
   		<li class="divider-vertical"></li>
   		<li><a href = """"),_display_(Seq[Any](/*231.22*/link(run.id, " ", "download"," " ))),format.raw/*231.56*/(""" "  >Export Page Data to Excel</a></li>
   	
       
   		
   </ul>
          

   

   </div>
   </div>
  </div>


        
    		
    	 
   	 </center>
   <script type="text/javascript" src=""""),_display_(Seq[Any](/*249.41*/routes/*249.47*/.Application.javascriptRoutes())),format.raw/*249.78*/(""""></script>  
    

	
            
    """)))})),format.raw/*254.6*/("""
    
    
	
""")))})),format.raw/*258.2*/("""
 		
    


            """))}
    }
    
    def render(id:Long,dataForm:Form[Run]): play.api.templates.Html = apply(id,dataForm)
    
    def f:((Long,Form[Run]) => play.api.templates.Html) = (id,dataForm) => apply(id,dataForm)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 19 17:13:45 EST 2013
                    SOURCE: C:/tmp/myregressionsite/app/views/runData.scala.html
                    HASH: b65c90a3f9f7d5683a0895403140861f3335f06a
                    MATRIX: 733->1|824->37|837->43|930->73|983->91|994->94|1032->111|1112->156|1138->161|1178->187|1189->191|1575->32|1605->179|1639->547|1681->554|1702->566|1742->568|1830->620|1845->626|1911->669|2099->821|2123->823|2290->954|2339->981|2398->1004|2446->1030|2505->1053|2560->1086|2619->1109|2672->1140|2731->1163|2777->1187|2836->1210|2904->1256|2963->1279|3013->1307|3072->1330|3120->1356|3163->1364|3215->1394|3274->1417|3320->1441|3379->1464|3448->1511|3571->1598|3614->1625|3654->1627|3774->1711|3803->1731|3843->1733|3937->1809|3950->1814|3989->1815|4060->1850|4072->1853|4126->1885|4189->1916|4317->2008|4346->2028|4386->2030|4480->2106|4493->2111|4532->2112|4603->2147|4615->2150|4642->2155|4705->2186|4815->2260|4847->2283|4887->2285|4981->2361|4994->2366|5033->2367|5104->2402|5116->2405|5151->2418|5192->2423|5204->2426|5248->2448|5311->2479|5421->2553|5449->2572|5489->2574|5583->2650|5596->2655|5635->2656|5706->2691|5718->2694|5748->2702|5811->2733|5939->2825|5975->2852|6015->2854|6109->2930|6122->2935|6161->2936|6232->2971|6244->2974|6278->2986|6341->3017|6469->3109|6505->3136|6545->3138|6639->3214|6652->3219|6691->3220|6762->3255|6774->3258|6832->3294|6895->3325|7005->3399|7112->3496|7153->3498|7247->3574|7260->3579|7299->3580|7370->3615|7483->3705|7546->3736|7674->3828|7780->3924|7821->3926|7916->4002|7930->4007|7970->4008|8042->4043|8155->4132|8219->4163|8330->4237|8439->4335|8481->4337|8576->4413|8590->4418|8630->4419|8702->4454|8817->4545|8881->4576|8992->4650|9033->4681|9074->4683|9169->4759|9183->4764|9223->4765|9295->4800|9308->4803|9350->4822|9414->4853|9525->4927|9583->4975|9624->4977|9719->5053|9733->5058|9773->5059|9845->5094|9862->5101|9917->5133|9981->5164|10247->5393|10272->5395|10390->5476|10443->5506|10487->5514|10548->5552|10592->5560|10659->5604|10704->5613|10774->5660|10818->5668|10890->5717|10934->5725|11009->5777|11138->5869|11184->5898|11225->5900|11319->5957|11332->5960|11362->5967|11447->6015|11482->6040|11523->6042|11618->6118|11632->6123|11672->6124|11744->6159|11757->6162|11795->6177|11859->6208|11948->6261|12007->6303|12048->6305|12096->6316|12145->6355|12186->6357|12263->6397|12283->6407|12311->6412|12355->6437|12369->6442|12409->6443|12458->6455|12508->6495|12549->6497|12629->6540|12649->6550|12677->6555|12720->6579|12734->6584|12774->6585|12854->6628|12874->6638|12902->6643|12958->6666|13002->6677|13069->6712|13158->6765|13202->6799|13243->6801|13293->6832|13307->6837|13347->6838|13395->6849|13408->6852|13455->6876|13497->6886|13586->6939|13627->6970|13668->6972|13718->7003|13732->7008|13772->7009|13820->7020|13833->7023|13877->7044|13919->7054|14008->7107|14046->7135|14087->7137|14137->7168|14151->7173|14191->7174|14239->7185|14252->7188|14315->7228|14357->7238|14474->7322|14894->7705|14949->7737|15028->7779|15086->7814|15168->7859|15225->7893|15308->7939|15367->7975|15451->8022|15508->8056|15709->8220|15772->8260|15907->8358|15976->8404|16115->8506|16182->8550|16319->8650|16376->8684|16625->8896|16641->8902|16695->8933|16772->8978|16822->8996
                    LINES: 26->1|28->3|28->3|30->3|31->4|31->4|31->4|32->5|32->5|34->9|34->9|45->1|47->7|49->19|52->22|52->22|52->22|53->23|53->23|53->23|56->26|56->26|61->31|61->31|62->32|62->32|63->33|63->33|64->34|64->34|65->35|65->35|66->36|66->36|67->37|67->37|68->38|68->38|69->39|69->39|70->40|70->40|71->41|71->41|76->46|76->46|76->46|79->49|79->49|79->49|81->51|81->51|81->51|82->52|82->52|82->52|83->53|86->56|86->56|86->56|88->58|88->58|88->58|89->59|89->59|89->59|90->60|93->63|93->63|93->63|95->65|95->65|95->65|96->66|96->66|96->66|96->66|96->66|96->66|97->67|100->70|100->70|100->70|102->72|102->72|102->72|103->73|103->73|103->73|104->74|107->77|107->77|107->77|109->79|109->79|109->79|110->80|110->80|110->80|111->81|114->84|114->84|114->84|116->86|116->86|116->86|117->87|117->87|117->87|118->88|121->91|121->91|121->91|123->93|123->93|123->93|124->94|124->94|125->95|128->98|128->98|128->98|130->100|130->100|130->100|131->101|131->101|132->102|135->105|135->105|135->105|137->107|137->107|137->107|138->108|138->108|139->109|142->112|142->112|142->112|144->114|144->114|144->114|145->115|145->115|145->115|146->116|149->119|149->119|149->119|151->121|151->121|151->121|152->122|152->122|152->122|153->123|163->133|163->133|166->136|166->136|167->137|167->137|168->138|168->138|169->139|169->139|170->140|170->140|171->141|171->141|176->146|176->146|176->146|178->148|178->148|178->148|180->150|180->150|180->150|182->152|182->152|182->152|183->153|183->153|183->153|184->154|187->157|187->157|187->157|188->158|188->158|188->158|189->159|189->159|189->159|190->160|190->160|190->160|191->161|191->161|191->161|192->162|192->162|192->162|193->163|193->163|193->163|194->164|194->164|194->164|195->165|196->166|199->169|202->172|202->172|202->172|204->174|204->174|204->174|205->175|205->175|205->175|206->176|209->179|209->179|209->179|211->181|211->181|211->181|212->182|212->182|212->182|213->183|216->186|216->186|216->186|218->188|218->188|218->188|219->189|219->189|219->189|220->190|224->194|244->214|244->214|245->215|245->215|246->216|246->216|247->217|247->217|248->218|248->218|255->225|255->225|257->227|257->227|259->229|259->229|261->231|261->231|279->249|279->249|279->249|284->254|288->258
                    -- GENERATED --
                */
            