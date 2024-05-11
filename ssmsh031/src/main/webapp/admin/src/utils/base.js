const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmsh031/",
            name: "ssmsh031",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmsh031/front/h5/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "火锅店点餐系统小程序"
        } 
    }
}
export default base
