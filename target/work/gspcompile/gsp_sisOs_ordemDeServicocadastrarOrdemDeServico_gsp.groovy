import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_sisOs_ordemDeServicocadastrarOrdemDeServico_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/ordemDeServico/cadastrarOrdemDeServico.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',4,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',4,[:],2)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("public2")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'content':("width=device-width, initial-scale=1"),'name':("viewport")],-1)
printHtmlPart(1)
})
invokeTag('captureHead','sitemesh',7,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(3)
if(true && (ok)) {
printHtmlPart(4)
expressionOut.print(ok)
printHtmlPart(5)
}
printHtmlPart(6)
if(true && (erro)) {
printHtmlPart(7)
expressionOut.print(erro)
printHtmlPart(5)
}
printHtmlPart(8)
createTagBody(2, {->
printHtmlPart(9)
expressionOut.print(erro)
printHtmlPart(10)
invokeTag('textField','g',60,['class':("form-control"),'placeholder':("99999-9999"),'id':("telefone"),'name':("telefone"),'value':(""),'onblur':("validaTelefone(telefone);")],-1)
printHtmlPart(11)
expressionOut.print(erro)
printHtmlPart(12)
invokeTag('textField','g',72,['type':("email"),'class':("form-control"),'placeholder':("E-mail"),'id':("email"),'name':("email"),'value':(""),'required':("true"),'onblur':("validaEMAIL(email)")],-1)
printHtmlPart(13)
expressionOut.print(erro)
printHtmlPart(14)
for( _it2102118692 in (orgao) ) {
changeItVariable(_it2102118692)
printHtmlPart(15)
expressionOut.print(it.id)
printHtmlPart(16)
expressionOut.print(it.nome)
printHtmlPart(17)
}
printHtmlPart(18)
})
invokeTag('form','g',109,['name':("ordemDeServico"),'controller':("ordemDeServico"),'action':("salvarOrdemDeServico"),'class':("form-horizontal")],2)
printHtmlPart(19)
})
invokeTag('captureBody','sitemesh',113,[:],1)
printHtmlPart(20)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1479833769065L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
