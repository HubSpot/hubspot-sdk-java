// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.blogs

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.cms.blogs.settings.Blog
import com.hubspot.sdk.models.cms.blogs.settings.BlogVersion
import com.hubspot.sdk.models.cms.blogs.settings.CollectionResponseWithTotalBlog
import com.hubspot.sdk.models.cms.blogs.settings.CollectionResponseWithTotalBlogVersion
import com.hubspot.sdk.models.cms.blogs.settings.SettingGetParams
import com.hubspot.sdk.models.cms.blogs.settings.SettingGetRevisionParams
import com.hubspot.sdk.models.cms.blogs.settings.SettingListPage
import com.hubspot.sdk.models.cms.blogs.settings.SettingListParams
import com.hubspot.sdk.models.cms.blogs.settings.SettingListRevisionsPage
import com.hubspot.sdk.models.cms.blogs.settings.SettingListRevisionsParams
import com.hubspot.sdk.services.blocking.cms.blogs.settings.MultiLanguageService
import com.hubspot.sdk.services.blocking.cms.blogs.settings.MultiLanguageServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class SettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettingService {

    private val withRawResponse: SettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val multiLanguage: MultiLanguageService by lazy {
        MultiLanguageServiceImpl(clientOptions)
    }

    override fun withRawResponse(): SettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService =
        SettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun multiLanguage(): MultiLanguageService = multiLanguage

    override fun list(params: SettingListParams, requestOptions: RequestOptions): SettingListPage =
        // get /cms/blog-settings/2026-03/settings
        withRawResponse().list(params, requestOptions).parse()

    override fun get(params: SettingGetParams, requestOptions: RequestOptions): Blog =
        // get /cms/blog-settings/2026-03/settings/{blogId}
        withRawResponse().get(params, requestOptions).parse()

    override fun getRevision(
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions,
    ): BlogVersion =
        // get /cms/blog-settings/2026-03/settings/{blogId}/revisions/{revisionId}
        withRawResponse().getRevision(params, requestOptions).parse()

    override fun listRevisions(
        params: SettingListRevisionsParams,
        requestOptions: RequestOptions,
    ): SettingListRevisionsPage =
        // get /cms/blog-settings/2026-03/settings/{blogId}/revisions
        withRawResponse().listRevisions(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val multiLanguage: MultiLanguageService.WithRawResponse by lazy {
            MultiLanguageServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingService.WithRawResponse =
            SettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun multiLanguage(): MultiLanguageService.WithRawResponse = multiLanguage

        private val listHandler: Handler<CollectionResponseWithTotalBlog> =
            jsonHandler<CollectionResponseWithTotalBlog>(clientOptions.jsonMapper)

        override fun list(
            params: SettingListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blog-settings", "2026-03", "settings")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SettingListPage.builder()
                            .service(SettingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val getHandler: Handler<Blog> = jsonHandler<Blog>(clientOptions.jsonMapper)

        override fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Blog> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("blogId", params.blogId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blog-settings",
                        "2026-03",
                        "settings",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getRevisionHandler: Handler<BlogVersion> =
            jsonHandler<BlogVersion>(clientOptions.jsonMapper)

        override fun getRevision(
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlogVersion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blog-settings",
                        "2026-03",
                        "settings",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getRevisionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listRevisionsHandler: Handler<CollectionResponseWithTotalBlogVersion> =
            jsonHandler<CollectionResponseWithTotalBlogVersion>(clientOptions.jsonMapper)

        override fun listRevisions(
            params: SettingListRevisionsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingListRevisionsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("blogId", params.blogId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blog-settings",
                        "2026-03",
                        "settings",
                        params._pathParam(0),
                        "revisions",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listRevisionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SettingListRevisionsPage.builder()
                            .service(SettingServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
