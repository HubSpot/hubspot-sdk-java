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
import com.hubspot.models.cms.blogs.tags.TagAttachToLangGroupParams
import com.hubspot.models.cms.blogs.tags.TagCreateLangVariationParams
import com.hubspot.models.cms.blogs.tags.TagCreateParams
import com.hubspot.models.cms.blogs.tags.TagDeleteParams
import com.hubspot.models.cms.blogs.tags.TagDetachFromLangGroupParams
import com.hubspot.models.cms.blogs.tags.TagGetParams
import com.hubspot.models.cms.blogs.tags.TagListAuthorsCursorByQueryParams
import com.hubspot.models.cms.blogs.tags.TagListAuthorsCursorParams
import com.hubspot.models.cms.blogs.tags.TagListCursorByQueryParams
import com.hubspot.models.cms.blogs.tags.TagListCursorParams
import com.hubspot.models.cms.blogs.tags.TagListParams
import com.hubspot.models.cms.blogs.tags.TagListPostsCursorByQueryParams
import com.hubspot.models.cms.blogs.tags.TagListPostsCursorParams
import com.hubspot.models.cms.blogs.tags.TagSetLangPrimaryParams
import com.hubspot.models.cms.blogs.tags.TagUpdateLangsParams
import com.hubspot.models.cms.blogs.tags.TagUpdateParams
import com.hubspot.services.blocking.cms.blogs.tags.BatchService
import com.hubspot.services.blocking.cms.blogs.tags.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TagServiceImpl internal constructor(private val clientOptions: ClientOptions) : TagService {

    private val withRawResponse: TagService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): TagService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService =
        TagServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun create(params: TagCreateParams, requestOptions: RequestOptions): HttpResponse =
        // post /cms/blogs/2026-03/tags
        withRawResponse().create(params, requestOptions)

    override fun update(params: TagUpdateParams, requestOptions: RequestOptions): HttpResponse =
        // patch /cms/blogs/2026-03/tags/{objectId}
        withRawResponse().update(params, requestOptions)

    override fun list(params: TagListParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/blogs/2026-03/tags
        withRawResponse().list(params, requestOptions)

    override fun delete(params: TagDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/blogs/2026-03/tags/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun attachToLangGroup(
        params: TagAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/tags/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions)

    override fun createLangVariation(
        params: TagCreateLangVariationParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/tags/multi-language/create-language-variation
        withRawResponse().createLangVariation(params, requestOptions)

    override fun detachFromLangGroup(
        params: TagDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/tags/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions)

    override fun get(params: TagGetParams, requestOptions: RequestOptions): HttpResponse =
        // get /cms/blogs/2026-03/tags/{objectId}
        withRawResponse().get(params, requestOptions)

    override fun listAuthorsCursor(
        params: TagListAuthorsCursorParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/authors/cursor
        withRawResponse().listAuthorsCursor(params, requestOptions)

    override fun listAuthorsCursorByQuery(
        params: TagListAuthorsCursorByQueryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/authors/cursor/query
        withRawResponse().listAuthorsCursorByQuery(params, requestOptions)

    override fun listCursor(
        params: TagListCursorParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/tags/cursor
        withRawResponse().listCursor(params, requestOptions)

    override fun listCursorByQuery(
        params: TagListCursorByQueryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/tags/cursor/query
        withRawResponse().listCursorByQuery(params, requestOptions)

    override fun listPostsCursor(
        params: TagListPostsCursorParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/posts/cursor
        withRawResponse().listPostsCursor(params, requestOptions)

    override fun listPostsCursorByQuery(
        params: TagListPostsCursorByQueryParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/posts/cursor/query
        withRawResponse().listPostsCursorByQuery(params, requestOptions)

    override fun setLangPrimary(params: TagSetLangPrimaryParams, requestOptions: RequestOptions) {
        // put /cms/blogs/2026-03/tags/multi-language/set-new-lang-primary
        withRawResponse().setLangPrimary(params, requestOptions)
    }

    override fun updateLangs(
        params: TagUpdateLangsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/tags/multi-language/update-languages
        withRawResponse().updateLangs(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagService.WithRawResponse =
            TagServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        override fun create(params: TagCreateParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun update(params: TagUpdateParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun list(params: TagListParams, requestOptions: RequestOptions): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags")
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(params: TagDeleteParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", params._pathParam(0))
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
            params: TagAttachToLangGroupParams,
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
                        "tags",
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

        override fun createLangVariation(
            params: TagCreateLangVariationParams,
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
                        "tags",
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
            params: TagDetachFromLangGroupParams,
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
                        "tags",
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

        override fun get(params: TagGetParams, requestOptions: RequestOptions): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "blogs", "2026-03", "tags", params._pathParam(0))
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun listAuthorsCursor(
            params: TagListAuthorsCursorParams,
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

        override fun listAuthorsCursorByQuery(
            params: TagListAuthorsCursorByQueryParams,
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

        override fun listCursor(
            params: TagListCursorParams,
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

        override fun listCursorByQuery(
            params: TagListCursorByQueryParams,
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

        override fun listPostsCursor(
            params: TagListPostsCursorParams,
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

        override fun listPostsCursorByQuery(
            params: TagListPostsCursorByQueryParams,
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

        private val setLangPrimaryHandler: Handler<Void?> = emptyHandler()

        override fun setLangPrimary(
            params: TagSetLangPrimaryParams,
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
                        "tags",
                        "multi-language",
                        "set-new-lang-primary",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { setLangPrimaryHandler.handle(it) }
            }
        }

        override fun updateLangs(
            params: TagUpdateLangsParams,
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
                        "tags",
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
