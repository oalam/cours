<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : newstylesheet.xsl
    Created on : 1 août 2011, 16:32
    Author     : Administrateur
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/bookstore">

        <books>
            
            <xsl:for-each select="book">
                <book> <xsl:value-of select="title"/></book>
            </xsl:for-each>
        </books>
</xsl:template>

</xsl:stylesheet>
