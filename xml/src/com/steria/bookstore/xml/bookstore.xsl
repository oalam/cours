<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : bookstore.xsl
    Created on : 1 août 2011, 12:22
    Author     : Administrateur
    Description:
        Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/bookstore">
        <html>
            <head>
                <title>le bookstore</title>
            </head>
            <body>
                <h2>The book Collection</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>Title</th>
                        <th>Artist</th>
                    </tr>
                    <xsl:for-each select="book">
                        <tr>
                            <td>
                                <xsl:value-of select="title"/>
                                <xsl:value-of select="price"/>
                            </td>
                            <td>
                                <xsl:value-of select="author"/>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
