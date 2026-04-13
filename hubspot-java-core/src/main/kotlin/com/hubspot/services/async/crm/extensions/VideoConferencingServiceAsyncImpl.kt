// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.crm.extensions

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.checkRequired
import com.hubspot.core.handlers.emptyHandler
import com.hubspot.core.handlers.errorBodyHandler
import com.hubspot.core.handlers.errorHandler
import com.hubspot.core.handlers.jsonHandler
import com.hubspot.core.http.HttpMethod
import com.hubspot.core.http.HttpRequest
import com.hubspot.core.http.HttpResponse
import com.hubspot.core.http.HttpResponse.Handler
import com.hubspot.core.http.HttpResponseFor
import com.hubspot.core.http.json
import com.hubspot.core.http.parseable
import com.hubspot.core.prepareAsync
import com.hubspot.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot.models.crm.extensions.videoconferencing.VideoConferencingDeleteParams
import com.hubspot.models.crm.extensions.videoconferencing.VideoConferencingGetParams
import com.hubspot.models.crm.extensions.videoconferencing.VideoConferencingUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VideoConferencingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : VideoConferencingServiceAsync {

    private val withRawResponse: VideoConferencingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VideoConferencingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VideoConferencingServiceAsync =
        VideoConferencingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: VideoConferencingUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalSettings> =
        // put /crm/extensions/videoconferencing/2026-03/settings/{appId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: VideoConferencingDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /crm/extensions/videoconferencing/2026-03/settings/{appId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun get(
        params: VideoConferencingGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalSettings> =
        // get /crm/extensions/videoconferencing/2026-03/settings/{appId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoConferencingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoConferencingServiceAsync.WithRawResponse =
            VideoConferencingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ExternalSettings> =
            jsonHandler<ExternalSettings>(clientOptions.jsonMapper)

        override fun update(
            params: VideoConferencingUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "videoconferencing",
                        "2026-03",
                        "settings",
                        params._pathParam(0),
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
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: VideoConferencingDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "videoconferencing",
                        "2026-03",
                        "settings",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val getHandler: Handler<ExternalSettings> =
            jsonHandler<ExternalSettings>(clientOptions.jsonMapper)

        override fun get(
            params: VideoConferencingGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalSettings>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "crm",
                        "extensions",
                        "videoconferencing",
                        "2026-03",
                        "settings",
                        params._pathParam(0),
                    )
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
    }
}
