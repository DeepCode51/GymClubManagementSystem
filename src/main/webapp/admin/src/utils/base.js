const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmzbr14/",
            name: "ssmzbr14",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmzbr14/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于java的健身房俱乐部管理系统"
        } 
    }
}
export default base
