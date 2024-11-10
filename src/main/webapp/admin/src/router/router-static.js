import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import huiyuantaocan from '@/views/modules/huiyuantaocan/list'
    import jianshenkecheng from '@/views/modules/jianshenkecheng/list'
    import discussjianshenqicai from '@/views/modules/discussjianshenqicai/list'
    import jianshenqicai from '@/views/modules/jianshenqicai/list'
    import qicaiyuding from '@/views/modules/qicaiyuding/list'
    import qicaifenlei from '@/views/modules/qicaifenlei/list'
    import forum from '@/views/modules/forum/list'
    import discusshuiyuantaocan from '@/views/modules/discusshuiyuantaocan/list'
    import huiyuanbanli from '@/views/modules/huiyuanbanli/list'
    import kechengfenlei from '@/views/modules/kechengfenlei/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import xuankexinxi from '@/views/modules/xuankexinxi/list'
    import discussjianshenkecheng from '@/views/modules/discussjianshenkecheng/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/news',
        name: '健身资讯',
        component: news
      }
      ,{
	path: '/huiyuantaocan',
        name: '会员套餐',
        component: huiyuantaocan
      }
      ,{
	path: '/jianshenkecheng',
        name: '健身课程',
        component: jianshenkecheng
      }
      ,{
	path: '/discussjianshenqicai',
        name: '健身器材评论',
        component: discussjianshenqicai
      }
      ,{
	path: '/jianshenqicai',
        name: '健身器材',
        component: jianshenqicai
      }
      ,{
	path: '/qicaiyuding',
        name: '器材预订',
        component: qicaiyuding
      }
      ,{
	path: '/qicaifenlei',
        name: '器材分类',
        component: qicaifenlei
      }
      ,{
	path: '/forum',
        name: '论坛交流',
        component: forum
      }
      ,{
	path: '/discusshuiyuantaocan',
        name: '会员套餐评论',
        component: discusshuiyuantaocan
      }
      ,{
	path: '/huiyuanbanli',
        name: '会员办理',
        component: huiyuanbanli
      }
      ,{
	path: '/kechengfenlei',
        name: '课程分类',
        component: kechengfenlei
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/xuankexinxi',
        name: '选课信息',
        component: xuankexinxi
      }
      ,{
	path: '/discussjianshenkecheng',
        name: '健身课程评论',
        component: discussjianshenkecheng
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
