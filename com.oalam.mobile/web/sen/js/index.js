ListDemo = new Ext.Application({
    name: "ListDemo",

    launch: function() {


        ListDemo.detailToolbar = new Ext.Toolbar({
            items: [{
                text: 'back',
                ui: 'back',
                handler: function() {
                    ListDemo.Viewport.setActiveItem('indexlist');
                }
            }]
        });

        ListDemo.detailPanel = new Ext.Panel({
            id: 'detailpanel',
            tpl: 'Hello, {firstName}!',
            dockedItems: [ListDemo.detailToolbar]
        });

    


        ListDemo.indexlist = new Ext.List({
            id: 'indexlist',
            store: ListDemo.ListStore,
            itemTpl: '<div class="contact">{firstName} {lastName}</div>',
            grouped: true,
            onItemDisclosure: function(record) {
                var name = record.data.firstName + " " + record.data.lastName;
                ListDemo.detailToolbar.setTitle(name);
                ListDemo.detailPanel.update(record.data);
                ListDemo.Viewport.setActiveItem('detailpanel');
            }
        });

        ListDemo.Viewport = new Ext.Panel ({
            fullscreen: true,
            layout: 'card',
            items: [ListDemo.indexlist, ListDemo.detailPanel]
        });
    }
});