// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.crm.extensions

import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.checkRequired
import com.hubspot.sdk.core.handlers.emptyHandler
import com.hubspot.sdk.core.handlers.errorBodyHandler
import com.hubspot.sdk.core.handlers.errorHandler
import com.hubspot.sdk.core.handlers.jsonHandler
import com.hubspot.sdk.core.http.HttpMethod
import com.hubspot.sdk.core.http.HttpRequest
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponse.Handler
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.core.http.json
import com.hubspot.sdk.core.http.parseable
import com.hubspot.sdk.core.prepare
import com.hubspot.sdk.models.crm.extensions.videoconferencing.ExternalSettings
import com.hubspot.sdk.models.crm.extensions.videoconferencing.VideoConferencingDeleteParams
import com.hubspot.sdk.models.crm.extensions.videoconferencing.VideoConferencingGetParams
import com.hubspot.sdk.models.crm.extensions.videoconferencing.VideoConferencingUpdateParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class VideoConferencingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VideoConferencingService {

    private val withRawResponse: VideoConferencingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VideoConferencingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): VideoConferencingService =
        VideoConferencingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun update(
        params: VideoConferencingUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalSettings =
        // put /crm/extensions/videoconferencing/2026-03/settings/{appId}
        withRawResponse().update(params, requestOptions).parse()

    override fun delete(params: VideoConferencingDeleteParams, requestOptions: RequestOptions) {
        // delete /crm/extensions/videoconferencing/2026-03/settings/{appId}
        withRawResponse().delete(params, requestOptions)
    }

    override fun get(
        params: VideoConferencingGetParams,
        requestOptions: RequestOptions,
    ): ExternalSettings =
        // get /crm/extensions/videoconferencing/2026-03/settings/{appId}
        withRawResponse().get(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VideoConferencingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VideoConferencingService.WithRawResponse =
            VideoConferencingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val updateHandler: Handler<ExternalSettings> =
            jsonHandler<ExternalSettings>(clientOptions.jsonMapper)

        override fun update(
            params: VideoConferencingUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalSettings> {
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: VideoConferencingDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val getHandler: Handler<ExternalSettings> =
            jsonHandler<ExternalSettings>(clientOptions.jsonMapper)

        override fun get(
            params: VideoConferencingGetParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalSettings> {
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
    }
}
