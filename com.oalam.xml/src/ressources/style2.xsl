<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : style2.xsl
    Created on : 28 juin 2012, 12:52
    Author     : HumanBooster
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="xml"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <artists>

                
            <xsl:for-each  select="catalog/cd">
                <artist>
                    <xsl:value-of select="artist"/>
                </artist>
            </xsl:for-each>
        </artists>
    </xsl:template>

</xsl:stylesheet>
