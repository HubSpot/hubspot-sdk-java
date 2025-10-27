// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

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
import com.hubspot_sdk.api.core.prepare
import com.hubspot_sdk.api.models.cms.blogs.tags.BatchResponseTag
import com.hubspot_sdk.api.models.cms.blogs.tags.CollectionResponseWithTotalTagForwardPaging
import com.hubspot_sdk.api.models.cms.blogs.tags.Tag
import com.hubspot_sdk.api.models.cms.blogs.tags.TagArchiveBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateLangVariationParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListPage
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagReadBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagReadParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateLangsParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class TagServiceImpl internal constructor(private val clientOptions: ClientOptions) : TagService {

    private val withRawResponse: TagService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TagService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService =
        TagServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: TagCreateParams, requestOptions: RequestOptions): Tag =
        // post /cms/v3/blogs/tags
        withRawResponse().create(params, requestOptions).parse()

    override fun update(params: TagUpdateParams, requestOptions: RequestOptions): Tag =
        // patch /cms/v3/blogs/tags/{objectId}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: TagListParams, requestOptions: RequestOptions): TagListPage =
        // get /cms/v3/blogs/tags
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: TagDeleteParams, requestOptions: RequestOptions) {
        // delete /cms/v3/blogs/tags/{objectId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun archiveBatch(params: TagArchiveBatchParams, requestOptions: RequestOptions) {
        // post /cms/v3/blogs/tags/batch/archive
        withRawResponse().archiveBatch(params, requestOptions)
    }

    override fun attachToLangGroup(
        params: TagAttachToLangGroupParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/blogs/tags/multi-language/attach-to-lang-group
        withRawResponse().attachToLangGroup(params, requestOptions)
    }

    override fun createBatch(
        params: TagCreateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseTag =
        // post /cms/v3/blogs/tags/batch/create
        withRawResponse().createBatch(params, requestOptions).parse()

    override fun createLangVariation(
        params: TagCreateLangVariationParams,
        requestOptions: RequestOptions,
    ): Tag =
        // post /cms/v3/blogs/tags/multi-language/create-language-variation
        withRawResponse().createLangVariation(params, requestOptions).parse()

    override fun detachFromLangGroup(
        params: TagDetachFromLangGroupParams,
        requestOptions: RequestOptions,
    ) {
        // post /cms/v3/blogs/tags/multi-language/detach-from-lang-group
        withRawResponse().detachFromLangGroup(params, requestOptions)
    }

    override fun read(params: TagReadParams, requestOptions: RequestOptions): Tag =
        // get /cms/v3/blogs/tags/{objectId}
        withRawResponse().read(params, requestOptions).parse()

    override fun readBatch(
        params: TagReadBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseTag =
        // post /cms/v3/blogs/tags/batch/read
        withRawResponse().readBatch(params, requestOptions).parse()

    override fun setLangPrimary(params: TagSetLangPrimaryParams, requestOptions: RequestOptions) {
        // put /cms/v3/blogs/tags/multi-language/set-new-lang-primary
        withRawResponse().setLangPrimary(params, requestOptions)
    }

    override fun updateBatch(
        params: TagUpdateBatchParams,
        requestOptions: RequestOptions,
    ): BatchResponseTag =
        // post /cms/v3/blogs/tags/batch/update
        withRawResponse().updateBatch(params, requestOptions).parse()

    override fun updateLangs(params: TagUpdateLangsParams, requestOptions: RequestOptions) {
        // post /cms/v3/blogs/tags/multi-language/update-languages
        withRawResponse().updateLangs(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TagService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TagService.WithRawResponse =
            TagServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Tag> = jsonHandler<Tag>(clientOptions.jsonMapper)

        override fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Tag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "tags")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Tag> = jsonHandler<Tag>(clientOptions.jsonMapper)

        override fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Tag> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "tags", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CollectionResponseWithTotalTagForwardPaging> =
            jsonHandler<CollectionResponseWithTotalTagForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: TagListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TagListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "tags")
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
                        TagListPage.builder()
                            .service(TagServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
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
                    .addPathSegments("cms", "v3", "blogs", "tags", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val archiveBatchHandler: Handler<Void?> = emptyHandler()

        override fun archiveBatch(
            params: TagArchiveBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "tags", "batch", "archive")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { archiveBatchHandler.handle(it) }
            }
        }

        private val attachToLangGroupHandler: Handler<Void?> = emptyHandler()

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
                        "v3",
                        "blogs",
                        "tags",
                        "multi-language",
                        "attach-to-lang-group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { attachToLangGroupHandler.handle(it) }
            }
        }

        private val createBatchHandler: Handler<BatchResponseTag> =
            jsonHandler<BatchResponseTag>(clientOptions.jsonMapper)

        override fun createBatch(
            params: TagCreateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseTag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "tags", "batch", "create")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createLangVariationHandler: Handler<Tag> =
            jsonHandler<Tag>(clientOptions.jsonMapper)

        override fun createLangVariation(
            params: TagCreateLangVariationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Tag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "v3",
                        "blogs",
                        "tags",
                        "multi-language",
                        "create-language-variation",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createLangVariationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val detachFromLangGroupHandler: Handler<Void?> = emptyHandler()

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
                        "v3",
                        "blogs",
                        "tags",
                        "multi-language",
                        "detach-from-lang-group",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { detachFromLangGroupHandler.handle(it) }
            }
        }

        private val readHandler: Handler<Tag> = jsonHandler<Tag>(clientOptions.jsonMapper)

        override fun read(
            params: TagReadParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Tag> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "tags", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { readHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val readBatchHandler: Handler<BatchResponseTag> =
            jsonHandler<BatchResponseTag>(clientOptions.jsonMapper)

        override fun readBatch(
            params: TagReadBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseTag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "tags", "batch", "read")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { readBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
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
                        "v3",
                        "blogs",
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

        private val updateBatchHandler: Handler<BatchResponseTag> =
            jsonHandler<BatchResponseTag>(clientOptions.jsonMapper)

        override fun updateBatch(
            params: TagUpdateBatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BatchResponseTag> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cms", "v3", "blogs", "tags", "batch", "update")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateBatchHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateLangsHandler: Handler<Void?> = emptyHandler()

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
                        "v3",
                        "blogs",
                        "tags",
                        "multi-language",
                        "update-languages",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { updateLangsHandler.handle(it) }
            }
        }
    }
}
