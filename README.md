# lebontrain
Le bon train est une application pour rechercher les horaires de train SNCF
## API Key
96c9d722-e8a7-4d87-bb53-360c36d3e3fa

Comment vous authentifier à l'API ?
Accédez à l'API : https://api.sncf.com/v1
Username : copiez puis collez votre clé
Password : laissez le champ vide

ou copiez votre clé directement dans l'URL.

Comment utiliser l’API ?

Quelques exemples :

Le détail des modes de transport couvert par l’API
GET https://api.sncf.com/v1/coverage/sncf/commercial_modes

Itinéraires entre Paris et Lyon
GET https://api.sncf.com/v1/coverage/sncf/journeys?from=admin:fr:75056&to=admin:fr:69123&datetime=20231207T171017

Prochains départs à Montparnasse
GET https://api.sncf.com/v1/coverage/sncf/stop_areas/stop_area:SNCF:87391003/departures?datetime=20231207T171017

Documentation
Support
L'équipe API SNCF
