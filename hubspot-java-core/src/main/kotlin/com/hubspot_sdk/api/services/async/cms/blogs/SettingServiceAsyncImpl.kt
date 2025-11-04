// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.core.handlers.emptyHandler
import com.hubspot_sdk.api.core.handlers.errorBodyHandler
import com.hubspot_sdk.api.core.handlers.errorHandler
import com.hubspot_sdk.api.core.handlers.jsonHandler
import com.hubspot_sdk.api.core.http.HttpMethod
import com.hubspot_sdk.api.core.http.HttpRequest
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponse.Handler
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.core.http.json
import com.hubspot_sdk.api.core.http.parseable
import com.hubspot_sdk.api.core.prepareAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.Blog
import com.hubspot_sdk.api.models.cms.blogs.settings.CollectionResponseWithTotalBlogForwardPaging
import com.hubspot_sdk.api.models.cms.blogs.settings.CollectionResponseWithTotalVersionBlog
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetRevisionParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.blogs.settings.VersionBlog
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SettingServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingServiceAsync {

    private val withRawResponse: SettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync =
        SettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: SettingListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingListPageAsync> =
        // get /cms/v3/blog-settings/settings
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun attachToLangGroup(
        params: SettingAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blog-settings/settings/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions).thenAccept {}

    override fun createLanguageVariation(
        params: SettingCreateLanguageVariationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Blog> =
        // post /cms/v3/blog-settings/settings/multi-language/create-language-variation
        withRawResponse().createLanguageVariation(params, requestOptions).thenApply { it.parse() }

    override fun detachFromLangGroup(
        params: SettingDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blog-settings/settings/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions).thenAccept {}

    override fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Blog> =
        // get /cms/v3/blog-settings/settings/{blogId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    override fun getRevision(
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VersionBlog> =
        // get /cms/v3/blog-settings/settings/{blogId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).thenApply { it.parse() }

    override fun listRevisions(
        params: SettingListRevisionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettingListRevisionsPageAsync> =
        // get /cms/v3/blog-settings/settings/{blogId}/revisions
        withRawResponse().listRevisions(params, requestOptions).thenApply { it.parse() }

    override fun setNewLangPrimary(
        params: SettingSetNewLangPrimaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // put /cms/v3/blog-settings/settings/multi-language/set-new-lang-primary
        withRawResponse().setNewLangPrimary(params, requestOptions).thenAccept {}

    override fun updateLanguages(
        params: SettingUpdateLanguagesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /cms/v3/blog-settings/settings/multi-language/update-languages
        withRawResponse().updateLanguages(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse =
            SettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CollectionResponseWithTotalBlogForwardPaging> =
            jsonHandler<CollectionResponseWithTotalBlogForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: SettingListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blog-settings", "settings")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SettingListPageAsync.builder()
                                    .service(SettingServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val attachToLangGroupHandler: Handler<Void?> = emptyHandler()

        override fun attachToLangGroup(
            params: SettingAttachToLangGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blog-settings",
                        "settings",
                        "multi-language",
                        "attach-to-lang-group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { attachToLangGroupHandler.handle(it) }
                    }
                }
        }

        private val createLanguageVariationHandler: Handler<Blog> =
            jsonHandler<Blog>(clientOptions.jsonMapper)

        override fun createLanguageVariation(
            params: SettingCreateLanguageVariationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Blog>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blog-settings",
                        "settings",
                        "multi-language",
                        "create-language-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createLanguageVariationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val detachFromLangGroupHandler: Handler<Void?> = emptyHandler()

        override fun detachFromLangGroup(
            params: SettingDetachFromLangGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blog-settings",
                        "settings",
                        "multi-language",
                        "detach-from-lang-group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { detachFromLangGroupHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<Blog> = jsonHandler<Blog>(clientOptions.jsonMapper)

        override fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Blog>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("blogId", params.blogId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blog-settings", "settings", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getRevisionHandler: Handler<VersionBlog> =
            jsonHandler<VersionBlog>(clientOptions.jsonMapper)

        override fun getRevision(
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VersionBlog>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blog-settings",
                        "settings",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getRevisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalVersionBlog> =
            jsonHandler<CollectionResponseWithTotalVersionBlog>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: SettingListRevisionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettingListRevisionsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("blogId", params.blogId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blog-settings",
                        "settings",
                        params._pathParam(0),
                        "revisions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listRevisionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                SettingListRevisionsPageAsync.builder()
                                    .service(SettingServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val setNewLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setNewLangPrimary(
            params: SettingSetNewLangPrimaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blog-settings",
                        "settings",
                        "multi-language",
                        "set-new-lang-primary",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { setNewLangPrimaryHandler.handle(it) }
                    }
                }
        }

        private val updateLanguagesHandler: Handler<Void?> = emptyHandler()

        override fun updateLanguages(
            params: SettingUpdateLanguagesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blog-settings",
                        "settings",
                        "multi-language",
                        "update-languages",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { updateLanguagesHandler.handle(it) }
                    }
                }
        }
    }
}
