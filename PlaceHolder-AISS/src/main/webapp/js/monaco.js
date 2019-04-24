require.config({
    paths: {
        vs: "https://unpkg.com/monaco-editor@0.8.3/min/vs"
    }
});

window.MonacoEnvironment = {
    getWorkerUrl: () => proxy
};
let proxy = URL.createObjectURL(
    new Blob(
        [
            `
            self.MonacoEnvironment = {
                baseUrl: 'https://unpkg.com/monaco-editor@0.8.3/min/'
            };
            importScripts('https://unpkg.com/monaco-editor@0.8.3/min/vs/base/worker/workerMain.js');
        `
        ], {
            type: "text/javascript"
        }
    )
);

require(["vs/editor/editor.main"], function () {
//    var originalModel = monaco.editor.createModel('\npackage aiss.controller.oauth;\n\nimport java.io.IOException;\nimport java.util.UUID;\nimport java.util.logging.Logger;\n\nimport javax.servlet.ServletException;\nimport javax.servlet.http.HttpServletRequest;\nimport javax.servlet.http.HttpServletResponse;\n\nimport aiss.utility.OAuthRegistry;\n\nimport com.google.api.client.auth.oauth2.AuthorizationCodeFlow;\nimport com.google.api.client.auth.oauth2.AuthorizationCodeResponseUrl;\nimport com.google.api.client.auth.oauth2.Credential;\nimport com.google.api.client.extensions.servlet.auth.oauth2.AbstractAuthorizationCodeCallbackServlet;\nimport com.google.api.client.http.GenericUrl;\n\n\/**\n * Servlet implementation class OAuth2Callback\n *\/\npublic class OAuth2Callback extends AbstractAuthorizationCodeCallbackServlet {\n\tprivate static final long serialVersionUID = 1L;\n\tprivate static Logger log=Logger.getLogger(OAuth2Callback.class.getName());\n\t\t\n\t@Override\n\tprotected void onSuccess(HttpServletRequest req, HttpServletResponse resp, Credential credential)\n\t\t\tthrows ServletException, IOException {\n\t\tString provider=getInitParameter(\"provider\");\n\t\treq.getSession().setAttribute(provider+\"-token\", credential.getAccessToken());\n\t\tOAuthRegistry.onAuthorizationSuccess(getInitParameter(\"onSuccess\"), provider, credential, req, resp);\t\t\t\t\n\t\t\n\t}\n\n\t@Override\n\tprotected void onError(HttpServletRequest req, HttpServletResponse resp, AuthorizationCodeResponseUrl errorResponse)\n\t\t\tthrows ServletException, IOException {\n\t\tlog.warning(\"ERROR on OAuth Callback! \"+errorResponse.getCode()+\": \"+errorResponse.getError()+\". \"+errorResponse.getErrorDescription());\n\t\tresp.getWriter().append(\"ERROR!\").append(errorResponse.getCode()).append(\": \")\n\t\t\t.append(errorResponse.getError()).append(errorResponse.getErrorDescription());\n\t}\n\n\t@Override\n\tprotected String getRedirectUri(HttpServletRequest req) throws ServletException, IOException {\n\t\t\t\t\n\t\tGenericUrl url = new GenericUrl(req.getRequestURL().toString());\n\t\turl.setRawPath(\"\/oauth2callback\/\"+getInitParameter(\"provider\"));\n\t\treturn url.build();\n\t}\n\n\t@Override\n\tprotected AuthorizationCodeFlow initializeFlow() throws IOException {\t\t\n\t\treturn OAuthRegistry.initializeFlow(getInitParameter(\"provider\"));\n\t}\n\n\t@Override\n\tprotected String getUserId(HttpServletRequest req) throws ServletException, IOException {\t\t\n\t\treturn UUID.randomUUID().toString();\n\t}\n}\n', "java");
    let editor = monaco.editor.create(document.getElementById("editor"), {
        theme: "vs-dark"
    });

    window.editor = editor;

    editor.addListener("didType", () => {
        console.log(editor.getValue());
    });
});

// require(["vs/editor/editor.main"], function () {
//     var originalModel = monaco.editor.createModel("def hola():\n\tprint('Hola mundo')", "python");
//     window.editor.setModel(originalModel); 
// });