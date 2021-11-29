/*
 * ATTENTION: The "eval" devtool has been used (maybe by default in mode: "development").
 * This devtool is neither made for production nor for readable output files.
 * It uses "eval()" calls to create a separate source file in the browser devtools.
 * If you are trying to read the output file, select a different devtool (https://webpack.js.org/configuration/devtool/)
 * or disable the default devtool with "devtool: false".
 * If you are looking for production-ready output files, see mode: "production" (https://webpack.js.org/configuration/mode/).
 */
/******/ (() => { // webpackBootstrap
/******/ 	var __webpack_modules__ = ({

/***/ "./script/actions.js":
/*!***************************!*\
  !*** ./script/actions.js ***!
  \***************************/
/***/ ((__unused_webpack_module, exports) => {

eval("exports.registerUserAction = (url, obj) => {\n    fetch(url, {\n        method:\"POST\", \n        body:JSON.stringify(obj), \n        headers:{\n            \"Content-Type\":\"application/json\"\n        }\n    })\n        .then(resp => resp.json())\n        .then(data => {\n            console.log(\"Registered User\");\n            location.href =\"../index.html\"\n        })\n        .catch(err => console.err(\"Regisration not success\" + err));\n} \n\n//# sourceURL=webpack://app/./script/actions.js?");

/***/ }),

/***/ "./script/app.js":
/*!***********************!*\
  !*** ./script/app.js ***!
  \***********************/
/***/ ((__unused_webpack_module, __unused_webpack_exports, __webpack_require__) => {

eval("const {sayHi, validateRegObject} = __webpack_require__(/*! ./util */ \"./script/util.js\");\nconst {registerUserAction} = __webpack_require__(/*! ./actions */ \"./script/actions.js\")\n\n\nconst initApp =() => {\n    let registerBtn = document.getElementById(\"regBtn\");\n    registerBtn.addEventListener(\"click\", fnRegisterBtn);\n}\n\nconst fnRegisterBtn= (event) => {\n    event.preventDefault();\n    const regObj = {};\n    regObj.userName = document.getElementById(\"username\").value;\n    regObj.password = document.getElementById(\"password\").value;\n    regObj.email = document.getElementById(\"email\").value;\n    console.log(sayHi(regObj.userName));\n    // validation \n    if(!validateRegObject(regObj)){\n        return false; \n    }\n    // invoking the end point happens here \n    registerUserAction(\"http://localhost:3001/users\",regObj);\n}\n\n\ninitApp();\n\n//# sourceURL=webpack://app/./script/app.js?");

/***/ }),

/***/ "./script/util.js":
/*!************************!*\
  !*** ./script/util.js ***!
  \************************/
/***/ ((__unused_webpack_module, exports) => {

eval("exports.sayHi = (name) => {\n    return \"Hello \" + name\n}\n\nexports.validateRegObject =(regObj) => {\n    return regObj.userName.length > 6; \n}\n\n//# sourceURL=webpack://app/./script/util.js?");

/***/ })

/******/ 	});
/************************************************************************/
/******/ 	// The module cache
/******/ 	var __webpack_module_cache__ = {};
/******/ 	
/******/ 	// The require function
/******/ 	function __webpack_require__(moduleId) {
/******/ 		// Check if module is in cache
/******/ 		var cachedModule = __webpack_module_cache__[moduleId];
/******/ 		if (cachedModule !== undefined) {
/******/ 			return cachedModule.exports;
/******/ 		}
/******/ 		// Create a new module (and put it into the cache)
/******/ 		var module = __webpack_module_cache__[moduleId] = {
/******/ 			// no module.id needed
/******/ 			// no module.loaded needed
/******/ 			exports: {}
/******/ 		};
/******/ 	
/******/ 		// Execute the module function
/******/ 		__webpack_modules__[moduleId](module, module.exports, __webpack_require__);
/******/ 	
/******/ 		// Return the exports of the module
/******/ 		return module.exports;
/******/ 	}
/******/ 	
/************************************************************************/
/******/ 	
/******/ 	// startup
/******/ 	// Load entry module and return exports
/******/ 	// This entry module can't be inlined because the eval devtool is used.
/******/ 	var __webpack_exports__ = __webpack_require__("./script/app.js");
/******/ 	
/******/ })()
;