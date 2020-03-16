new Vue({
    el:"#app",
    data:{
        user:{
            id:"",
            username:"",
            password:"",
            sex:"",
            age:"",
            email:"",
        },
        userList:[]
    },
    methods:{
     findAll:function () {
         //在当前方法定义一个变了，表面是vue对象
         var _this = this;
         axios.get('/ajax_war/user/findAll.do').then(function (response) {
             _this.userList = response.data;//响应数据给userList赋值
             console.log(response);
         }).catch(function (error) {
             console.log(error )
         })
     },
        findById:function(userid){
            //在当前方法定义一个变了，表面是vue对象
            var _this = this;
            axios.get('/ajax_war/user/findById.do',{params:{id:userid}}).then(function (response) {
                _this.user = response.data;//响应数据给userList赋值
                $("#myModal").modal("show");
                console.log(response);
            }).catch(function (error) {
                console.log(error )
            })
        },
        update:function(user){
            //在当前方法定义一个变了，表面是vue对象
            var _this = this;
            axios.post('/ajax_war/user/updateUser.do',_this.user).then(function (response) {
                _this.findAll();
                console.log(response);
            }).catch(function (error) {
                console.log(error )
            })
        },
    },

    created:function () { //当我们页面加载的时候触发查询所有
        this.findAll();
    }

});