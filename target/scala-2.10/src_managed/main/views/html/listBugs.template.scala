
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
object listBugs extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template4[com.avaje.ebean.Page[Bug],String,String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: com.avaje.ebean.Page[Bug], currentSortBy: String, currentOrder: String, currentFilter: String):play.api.templates.Html = {
        _display_ {
def /*37.2*/header/*37.8*/(key:String, title:String):play.api.templates.Html = {_display_(

Seq[Any](format.raw/*37.38*/("""
    <th class=""""),_display_(Seq[Any](/*38.17*/key/*38.20*/.replace(".","_"))),format.raw/*38.37*/(""" header """),_display_(Seq[Any](/*38.46*/if(currentSortBy == key){/*38.72*/{if(currentOrder == "asc") "headerSortDown" else "headerSortUp"}})),format.raw/*38.136*/("""">
        <a href=""""),_display_(Seq[Any](/*39.19*/link(0, key))),format.raw/*39.31*/("""">"""),_display_(Seq[Any](/*39.34*/title)),format.raw/*39.39*/("""</a>
    </th>
""")))};def /*6.2*/link/*6.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.Application.listBug(newPage, sortBy, order, currentFilter)
    
}};def /*28.2*/linkByBug/*28.11*/(bugID:Long) = {{
routes.Application.bugData(bugID);

}};
Seq[Any](format.raw/*1.110*/("""

"""),format.raw/*5.42*/("""
"""),format.raw/*27.2*/("""
"""),format.raw/*31.2*/("""


"""),format.raw/*36.37*/("""
"""),format.raw/*41.2*/("""

"""),_display_(Seq[Any](/*43.2*/homeSkeleton/*43.14*/ {_display_(Seq[Any](format.raw/*43.16*/("""
    <link rel="stylesheet" type="text/css" href=""""),_display_(Seq[Any](/*44.51*/routes/*44.57*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*44.100*/("""">
    <script type="text/javascript" src=""""),_display_(Seq[Any](/*45.42*/routes/*45.48*/.Application.javascriptRoutes())),format.raw/*45.79*/(""""></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
    <h1 id="homeTitle">"""),_display_(Seq[Any](/*47.25*/currentPage/*47.36*/.getTotalRowCount)),format.raw/*47.53*/(""" Bugs Found</h1>
    

    """),_display_(Seq[Any](/*50.6*/if(flash.containsKey("success"))/*50.38*/ {_display_(Seq[Any](format.raw/*50.40*/("""
        <div class="alert-message warning">
            <strong>Done!</strong> """),_display_(Seq[Any](/*52.37*/flash/*52.42*/.get("success"))),format.raw/*52.57*/("""
        </div>
    """)))})),format.raw/*54.6*/(""" 


	
    <div id="actions">
        
        <form action=""""),_display_(Seq[Any](/*60.24*/link(0, "name"))),format.raw/*60.39*/("""" method="GET">
            <input type="search" id="searchbox" name="f" value=""""),_display_(Seq[Any](/*61.66*/currentFilter)),format.raw/*61.79*/("""" placeholder="Search by Bug name...">
            <input type="submit" id="searchsubmit" value="Filter by number" class="btn primary">
        </form>
        
    </div>
    
    """),_display_(Seq[Any](/*67.6*/if(currentPage.getTotalRowCount == 0)/*67.43*/ {_display_(Seq[Any](format.raw/*67.45*/("""
        
        <div class="well">
            <em>Nothing to display</em>
        </div>
        
    """)))}/*73.7*/else/*73.12*/{_display_(Seq[Any](format.raw/*73.13*/("""
        
        <table class="Bug zebra-striped">
            <thead>
                <tr>
                    """),_display_(Seq[Any](/*78.22*/header("number", "Bug Number"))),format.raw/*78.52*/("""
					"""),_display_(Seq[Any](/*79.7*/header("bugstatus.name", "Bug Status"))),format.raw/*79.45*/("""
					"""),_display_(Seq[Any](/*80.7*/header("difference.name", "Difference Desc"))),format.raw/*80.51*/(""" 
					"""),_display_(Seq[Any](/*81.7*/header("pagesoutbug.run.format.name", "Format"))),format.raw/*81.54*/("""
					"""),_display_(Seq[Any](/*82.7*/header("pagesoutbug.run.version.name", "Version"))),format.raw/*82.56*/("""
					"""),_display_(Seq[Any](/*83.7*/header("pagesoutbug.run.date.name", "Date Appeared"))),format.raw/*83.59*/("""					
                </tr>
            </thead>
            <tbody>

                """),_display_(Seq[Any](/*88.18*/for(bug <- currentPage.getList) yield /*88.49*/ {_display_(Seq[Any](format.raw/*88.51*/("""
                    <tr>
                        <td>
							"""),_display_(Seq[Any](/*91.9*/if(bug.number == null)/*91.31*/{_display_(Seq[Any](format.raw/*91.32*/("""
								<em>-</em>
							""")))}/*93.10*/else/*93.15*/{_display_(Seq[Any](format.raw/*93.16*/("""
								<a href=""""),_display_(Seq[Any](/*94.19*/linkByBug(bug.id))),format.raw/*94.36*/("""" title="View all Bug Information from """),_display_(Seq[Any](/*94.76*/bug/*94.79*/.id)),format.raw/*94.82*/("""">"""),_display_(Seq[Any](/*94.85*/bug/*94.88*/.number)),format.raw/*94.95*/("""</a> 
							""")))})),format.raw/*95.9*/("""
						</td>
						<td>
                            """),_display_(Seq[Any](/*98.30*/if(bug.bugstatus == null)/*98.55*/ {_display_(Seq[Any](format.raw/*98.57*/("""
                                <em>-</em>
                            """)))}/*100.31*/else/*100.36*/{_display_(Seq[Any](format.raw/*100.37*/("""
                                """),_display_(Seq[Any](/*101.34*/bug/*101.37*/.bugstatus.name)),format.raw/*101.52*/("""
                            """)))})),format.raw/*102.30*/("""
                        </td>
						<td>
							"""),_display_(Seq[Any](/*105.9*/for(difference <- Bug.getDifferences(bug)) yield /*105.51*/ {_display_(Seq[Any](format.raw/*105.53*/("""
								"""),_display_(Seq[Any](/*106.10*/if(difference.difftype.name == "Worse")/*106.49*/ {_display_(Seq[Any](format.raw/*106.51*/("""
									<font color="red">&bull; <i>"""),_display_(Seq[Any](/*107.39*/difference/*107.49*/.name)),format.raw/*107.54*/("""</i></font>  
								""")))}/*108.11*/else/*108.16*/{_display_(Seq[Any](format.raw/*108.17*/("""
									"""),_display_(Seq[Any](/*109.11*/if(difference.difftype.name == "Better")/*109.51*/ {_display_(Seq[Any](format.raw/*109.53*/("""
										<font color="green">&bull; <i>"""),_display_(Seq[Any](/*110.42*/difference/*110.52*/.name)),format.raw/*110.57*/("""</i></font>
									""")))}/*111.12*/else/*111.17*/{_display_(Seq[Any](format.raw/*111.18*/("""
										<font color="black">&bull; <i>"""),_display_(Seq[Any](/*112.42*/difference/*112.52*/.name)),format.raw/*112.57*/("""</i></font>
									""")))})),format.raw/*113.11*/("""
								""")))})),format.raw/*114.10*/("""
								
								</br>
							""")))})),format.raw/*117.9*/("""
                        </td>
						<td>
							"""),_display_(Seq[Any](/*120.9*/if(Bug.getFileFormat(bug) == null)/*120.43*/ {_display_(Seq[Any](format.raw/*120.45*/("""
								<em>-</em>
							""")))}/*122.10*/else/*122.15*/{_display_(Seq[Any](format.raw/*122.16*/("""
								"""),_display_(Seq[Any](/*123.10*/Bug/*123.13*/.getFileFormat(bug).name)),format.raw/*123.37*/("""
							""")))})),format.raw/*124.9*/("""
                        </td>
						<td>
							"""),_display_(Seq[Any](/*127.9*/if(Bug.getVersion(bug) == null)/*127.40*/ {_display_(Seq[Any](format.raw/*127.42*/("""
								<em>-</em>
							""")))}/*129.10*/else/*129.15*/{_display_(Seq[Any](format.raw/*129.16*/("""
								"""),_display_(Seq[Any](/*130.10*/Bug/*130.13*/.getVersion(bug).name)),format.raw/*130.34*/("""
							""")))})),format.raw/*131.9*/("""
                        </td>
						<td>
							"""),_display_(Seq[Any](/*134.9*/if(Bug.getDate(bug) == null)/*134.37*/ {_display_(Seq[Any](format.raw/*134.39*/("""
								<em>-</em>
							""")))}/*136.10*/else/*136.15*/{_display_(Seq[Any](format.raw/*136.16*/("""
								"""),_display_(Seq[Any](/*137.10*/Bug/*137.13*/.getDate(bug).name.format("dd MMM yyyy"))),format.raw/*137.53*/("""
							""")))})),format.raw/*138.9*/("""
                        </td>
                    </tr>
					
                """)))})),format.raw/*142.18*/("""

            </tbody>
        </table>

        <div id="pagination" class="pagination">
            <ul>
                """),_display_(Seq[Any](/*149.18*/if(currentPage.hasPrev)/*149.41*/ {_display_(Seq[Any](format.raw/*149.43*/("""
                    <li class="prev">
                        <a href=""""),_display_(Seq[Any](/*151.35*/link(currentPage.getPageIndex - 1, null))),format.raw/*151.75*/("""">&larr; Previous</a>
                    </li>
                """)))}/*153.19*/else/*153.24*/{_display_(Seq[Any](format.raw/*153.25*/("""
                    <li class="prev disabled">
                        <a>&larr; Previous</a>
                    </li>
                """)))})),format.raw/*157.18*/("""
                <li class="current">
                    <a>Displaying """),_display_(Seq[Any](/*159.36*/currentPage/*159.47*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*159.80*/("""</a>
                </li>
                """),_display_(Seq[Any](/*161.18*/if(currentPage.hasNext)/*161.41*/ {_display_(Seq[Any](format.raw/*161.43*/("""
                    <li class="next">
                        <a href=""""),_display_(Seq[Any](/*163.35*/link(currentPage.getPageIndex + 1, null))),format.raw/*163.75*/("""">Next &rarr;</a>
                    </li>
                """)))}/*165.19*/else/*165.24*/{_display_(Seq[Any](format.raw/*165.25*/("""
                    <li class="next disabled">
                        <a>Next &rarr;</a>
                    </li>
                """)))})),format.raw/*169.18*/("""
            </ul>
        </div>
        
    """)))})),format.raw/*173.6*/("""
        
""")))})),format.raw/*175.2*/("""

            """))}
    }
    
    def render(currentPage:com.avaje.ebean.Page[Bug],currentSortBy:String,currentOrder:String,currentFilter:String): play.api.templates.Html = apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def f:((com.avaje.ebean.Page[Bug],String,String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder,currentFilter) => apply(currentPage,currentSortBy,currentOrder,currentFilter)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Dec 19 12:19:51 EST 2013
                    SOURCE: C:/Users/dhallahan/workspace/regressionsiteRnd2-1/eclipse-regressionsite/app/views/listBugs.scala.html
                    HASH: 32e16637ff0ab688cddcda34f3490e2e44346123
                    MATRIX: 766->1|935->961|949->967|1043->997|1097->1015|1109->1018|1148->1035|1193->1044|1227->1070|1315->1134|1373->1156|1407->1168|1446->1171|1473->1176|1513->243|1524->247|2063->775|2081->784|2170->109|2201->240|2230->772|2259->842|2293->958|2322->1194|2362->1199|2383->1211|2423->1213|2511->1265|2526->1271|2592->1314|2673->1359|2688->1365|2741->1396|2908->1527|2928->1538|2967->1555|3033->1586|3074->1618|3114->1620|3233->1703|3247->1708|3284->1723|3338->1746|3441->1813|3478->1828|3596->1910|3631->1923|3854->2111|3900->2148|3940->2150|4070->2263|4083->2268|4122->2269|4277->2388|4329->2418|4372->2426|4432->2464|4475->2472|4541->2516|4585->2525|4654->2572|4697->2580|4768->2629|4811->2637|4885->2689|5013->2781|5060->2812|5100->2814|5201->2880|5232->2902|5271->2903|5320->2934|5333->2939|5372->2940|5428->2960|5467->2977|5543->3017|5555->3020|5580->3023|5619->3026|5631->3029|5660->3036|5706->3051|5798->3107|5832->3132|5872->3134|5967->3210|5981->3215|6021->3216|6093->3251|6106->3254|6144->3269|6208->3300|6297->3353|6356->3395|6397->3397|6445->3408|6494->3447|6535->3449|6612->3489|6632->3499|6660->3504|6704->3529|6718->3534|6758->3535|6807->3547|6857->3587|6898->3589|6978->3632|6998->3642|7026->3647|7069->3671|7083->3676|7123->3677|7203->3720|7223->3730|7251->3735|7307->3758|7351->3769|7418->3804|7507->3857|7551->3891|7592->3893|7642->3924|7656->3929|7696->3930|7744->3941|7757->3944|7804->3968|7846->3978|7935->4031|7976->4062|8017->4064|8067->4095|8081->4100|8121->4101|8169->4112|8182->4115|8226->4136|8268->4146|8357->4199|8395->4227|8436->4229|8486->4260|8500->4265|8540->4266|8588->4277|8601->4280|8664->4320|8706->4330|8823->4414|8991->4545|9024->4568|9065->4570|9177->4645|9240->4685|9327->4753|9341->4758|9381->4759|9556->4901|9668->4976|9689->4987|9745->5020|9828->5066|9861->5089|9902->5091|10014->5166|10077->5206|10160->5270|10174->5275|10214->5276|10385->5414|10469->5466|10514->5479
                    LINES: 26->1|28->37|28->37|30->37|31->38|31->38|31->38|31->38|31->38|31->38|32->39|32->39|32->39|32->39|34->6|34->6|55->28|55->28|59->1|61->5|62->27|63->31|66->36|67->41|69->43|69->43|69->43|70->44|70->44|70->44|71->45|71->45|71->45|73->47|73->47|73->47|76->50|76->50|76->50|78->52|78->52|78->52|80->54|86->60|86->60|87->61|87->61|93->67|93->67|93->67|99->73|99->73|99->73|104->78|104->78|105->79|105->79|106->80|106->80|107->81|107->81|108->82|108->82|109->83|109->83|114->88|114->88|114->88|117->91|117->91|117->91|119->93|119->93|119->93|120->94|120->94|120->94|120->94|120->94|120->94|120->94|120->94|121->95|124->98|124->98|124->98|126->100|126->100|126->100|127->101|127->101|127->101|128->102|131->105|131->105|131->105|132->106|132->106|132->106|133->107|133->107|133->107|134->108|134->108|134->108|135->109|135->109|135->109|136->110|136->110|136->110|137->111|137->111|137->111|138->112|138->112|138->112|139->113|140->114|143->117|146->120|146->120|146->120|148->122|148->122|148->122|149->123|149->123|149->123|150->124|153->127|153->127|153->127|155->129|155->129|155->129|156->130|156->130|156->130|157->131|160->134|160->134|160->134|162->136|162->136|162->136|163->137|163->137|163->137|164->138|168->142|175->149|175->149|175->149|177->151|177->151|179->153|179->153|179->153|183->157|185->159|185->159|185->159|187->161|187->161|187->161|189->163|189->163|191->165|191->165|191->165|195->169|199->173|201->175
                    -- GENERATED --
                */
            