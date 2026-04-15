// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms.blogs.posts

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
import com.hubspot.sdk.core.prepareAsync
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionGetPreviousVersionsParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionParams
import com.hubspot.sdk.models.cms.blogs.posts.revisions.RevisionRestorePreviousVersionToDraftParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class RevisionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    RevisionServiceAsync {

    private val withRawResponse: RevisionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RevisionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): RevisionServiceAsync =
        RevisionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getPreviousVersion(
        params: RevisionGetPreviousVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}
        withRawResponse().getPreviousVersion(params, requestOptions)

    override fun getPreviousVersions(
        params: RevisionGetPreviousVersionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // get /cms/blogs/2026-03/posts/{objectId}/revisions
        withRawResponse().getPreviousVersions(params, requestOptions)

    override fun restorePreviousVersion(
        params: RevisionRestorePreviousVersionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore
        withRawResponse().restorePreviousVersion(params, requestOptions)

    override fun restorePreviousVersionToDraft(
        params: RevisionRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore-to-draft
        withRawResponse().restorePreviousVersionToDraft(params, requestOptions)

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RevisionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): RevisionServiceAsync.WithRawResponse =
            RevisionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun getPreviousVersion(
            params: RevisionGetPreviousVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun getPreviousVersions(
            params: RevisionGetPreviousVersionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun restorePreviousVersion(
            params: RevisionRestorePreviousVersionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun restorePreviousVersionToDraft(
            params: RevisionRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }
    }
}
