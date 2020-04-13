/*코드 내용

- React 소스 경로를 src/main/jsx로 설정

- MainPage와 Page1Page.jsx 빌드

- 빌드 결과 js 파일들을 src/main/webapp/js/react 아래 [페이지 이름].bundle.js로 놓음

 */
var path = require('path');
 
module.exports = {
    context: path.resolve(__dirname, 'src/main/jsx'),
    entry: {
        main: './MainPage.jsx',
        page1: './Page1Page.jsx'
    },
    devtool: 'sourcemaps',
    cache: true,
    output: {
        path: __dirname,
        filename: './src/main/webapp/js/react/[name].bundle.js'
    },
    mode: 'none',
    module: {
        rules: [ {
            test: /\.jsx?$/,
            exclude: /(node_modules)/,
            use: {
                loader: 'babel-loader',
                options: {
                    presets: [ '@babel/preset-env', '@babel/preset-react' ]
                }
            }
        }, {
            test: /\.css$/,
            use: [ 'style-loader', 'css-loader' ]
        } ]
    }
};
