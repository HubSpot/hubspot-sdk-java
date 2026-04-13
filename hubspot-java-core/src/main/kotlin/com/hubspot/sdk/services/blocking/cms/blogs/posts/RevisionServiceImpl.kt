// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.blogs.posts

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionsParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionToDraftParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RevisionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    RevisionService {

    private val withRawResponse: RevisionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RevisionService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionService =
        RevisionServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getPreviousVersion(
        params: RevisionGetPreviousVersionParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}
        withRawResponse().getPreviousVersion(params, requestOptions)

    override fun getPreviousVersions(
        params: RevisionGetPreviousVersionsParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // get /cms/blogs/2026-03/posts/{objectId}/revisions
        withRawResponse().getPreviousVersions(params, requestOptions)

    override fun restorePreviousVersion(
        params: RevisionRestorePreviousVersionParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restorePreviousVersion(params, requestOptions)

    override fun restorePreviousVersionToDraft(
        params: RevisionRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions,
    ): HttpResponse =
        // post /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restorePreviousVersionToDraft(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RevisionService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RevisionService.WithRawResponse =
            RevisionServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun getPreviousVersion(
            params: RevisionGetPreviousVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "posts",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                    )
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun getPreviousVersions(
            params: RevisionGetPreviousVersionsParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "posts",
                        params._pathParam(0),
                        "revisions",
                    )
                    .putHeader("Accept", "*/*")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun restorePreviousVersion(
            params: RevisionRestorePreviousVersionParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "posts",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore",
                    )
                    .putHeader("Accept", "*/*")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }

        override fun restorePreviousVersionToDraft(
            params: RevisionRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("revisionId", params.revisionId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "cms",
                        "blogs",
                        "2026-03",
                        "posts",
                        params._pathParam(0),
                        "revisions",
                        params._pathParam(1),
                        "restore-to-draft",
                    )
                    .putHeader("Accept", "*/*")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response)
        }
    }
}
