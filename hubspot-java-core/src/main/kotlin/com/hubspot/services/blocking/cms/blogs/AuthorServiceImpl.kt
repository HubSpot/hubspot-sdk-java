// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.cms.blogs

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepare
import com.hubspot.models.cms.blogs.authors.AuthorAttachToLangGroupParams
import com.hubspot.models.cms.blogs.authors.AuthorCreateLanguageVariationParams
import com.hubspot.models.cms.blogs.authors.AuthorCreateParams
import com.hubspot.models.cms.blogs.authors.AuthorDeleteParams
import com.hubspot.models.cms.blogs.authors.AuthorDetachFromLangGroupParams
import com.hubspot.models.cms.blogs.authors.AuthorGetCursorByQueryParams
import com.hubspot.models.cms.blogs.authors.AuthorGetCursorParams
import com.hubspot.models.cms.blogs.authors.AuthorGetParams
import com.hubspot.models.cms.blogs.authors.AuthorGetPostsCursorByQueryParams
import com.hubspot.models.cms.blogs.authors.AuthorGetPostsCursorParams
import com.hubspot.models.cms.blogs.authors.AuthorGetTagsCursorByQueryParams
import com.hubspot.models.cms.blogs.authors.AuthorGetTagsCursorParams
import com.hubspot.models.cms.blogs.authors.AuthorListParams
import com.hubspot.models.cms.blogs.authors.AuthorSetNewLangPrimaryParams
import com.hubspot.models.cms.blogs.authors.AuthorUpdateLanguagesParams
import com.hubspot.models.cms.blogs.authors.AuthorUpdateParams
import com.hubspot.services.blocking.cms.blogs.authors.BatchService
import com.hubspot.services.blocking.cms.blogs.authors.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AuthorServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthorService {

    private val withRawResponse: AuthorService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): AuthorService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthorService =
        AuthorServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun create(params: AuthorCreateParams, requestOptions: RequestOptions): HttpResponse =
        // post /cms/blogs/2026-03/authors
        withRawResponse().create(params, requestOptions)

    override fun update(params: AuthorUpdateParams, requestOptions: RequestOptions): HttpResponse =
        // patch /cms/blogs/2026-03/authors/{objectId}
        withRawResponse().update(params, requestOptions)

    override fun list(params: AuthorListParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/blogs/2026-03/authors
        withRawResponse().list(params, requestOptions)

    override fun delete(params: AuthorDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/blogs/2026-03/authors/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun attachToLangGroup(
        params: AuthorAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/authors/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions)

    override fun createLanguageVariation(
        params: AuthorCreateLanguageVariationParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/authors/multi-language/create-language-variation
        withRawResponse().createLanguageVariation(params, requestOptions)

    override fun detachFromLangGroup(
        params: AuthorDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/authors/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions)

    override fun get(params: AuthorGetParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/blogs/2026-03/authors/{objectId}
        withRawResponse().get(params, requestOptions)

    override fun getCursor(
        params: AuthorGetCursorParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/authors/cursor
        withRawResponse().getCursor(params, requestOptions)

    override fun getCursorByQuery(
        params: AuthorGetCursorByQueryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/authors/cursor/query
        withRawResponse().getCursorByQuery(params, requestOptions)

    override fun getPostsCursor(
        params: AuthorGetPostsCursorParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/posts/cursor
        withRawResponse().getPostsCursor(params, requestOptions)

    override fun getPostsCursorByQuery(
        params: AuthorGetPostsCursorByQueryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/posts/cursor/query
        withRawResponse().getPostsCursorByQuery(params, requestOptions)

    override fun getTagsCursor(
        params: AuthorGetTagsCursorParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/tags/cursor
        withRawResponse().getTagsCursor(params, requestOptions)

    override fun getTagsCursorByQuery(
        params: AuthorGetTagsCursorByQueryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/tags/cursor/query
        withRawResponse().getTagsCursorByQuery(params, requestOptions)

    override fun setNewLangPrimary(
        params: AuthorSetNewLangPrimaryParams,
        requestOptions: RequestOptions,
    ) {
        // put /cms/blogs/2026-03/authors/multi-language/set-new-lang-primary
        withRawResponse().setNewLangPrimary(params, requestOptions)
    }

    override fun updateLanguages(
        params: AuthorUpdateLanguagesParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/authors/multi-language/update-languages
        withRawResponse().updateLanguages(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthorService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthorService.WithRawResponse =
            AuthorServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun create(
            params: AuthorCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun update(
            params: AuthorUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun list(params: AuthorListParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AuthorDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        override fun attachToLangGroup(
            params: AuthorAttachToLangGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "authors",
                        "multi-language",
                        "attach-to-lang-group",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "authors",
                        "multi-language",
                        "create-language-variation",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun detachFromLangGroup(
            params: AuthorDetachFromLangGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "authors",
                        "multi-language",
                        "detach-from-lang-group",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun get(params: AuthorGetParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getCursor(
            params: AuthorGetCursorParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors", "cursor")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getCursorByQuery(
            params: AuthorGetCursorByQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "authors", "cursor", "query")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getPostsCursor(
            params: AuthorGetPostsCursorParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", "cursor")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getPostsCursorByQuery(
            params: AuthorGetPostsCursorByQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "posts", "cursor", "query")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getTagsCursor(
            params: AuthorGetTagsCursorParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", "cursor")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getTagsCursorByQuery(
            params: AuthorGetTagsCursorByQueryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", "cursor", "query")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val setNewLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setNewLangPrimary(
            params: AuthorSetNewLangPrimaryParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "authors",
                        "multi-language",
                        "set-new-lang-primary",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setNewLangPrimaryHandler.handle(it) }
            }
        }

        override fun updateLanguages(
            params: AuthorUpdateLanguagesParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "authors",
                        "multi-language",
                        "update-languages",
                    )
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
