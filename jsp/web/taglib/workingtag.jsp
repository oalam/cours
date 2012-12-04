<%@ taglib uri="monTag" prefix="montagamoi" %>

<montagamoi:explainworkingtag test="body" apoca="fin">
	Le texte doit normalement s'afficher!!!
</montagamoi:explainworkingtag>

<montagamoi:explainworkingtag test="autre" apoca="fin">
	Le texte ne doit pas s'afficher!!!
</montagamoi:explainworkingtag>

<montagamoi:explainworkingtag test="autre" apoca="autre">
	Le texte ne doit pas s'afficher!!!
</montagamoi:explainworkingtag>

Le reste de la page ne doit pas être vu.