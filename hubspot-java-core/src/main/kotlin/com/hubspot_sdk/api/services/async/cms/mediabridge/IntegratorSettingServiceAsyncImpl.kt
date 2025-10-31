// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

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
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateObjectDefinitionParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateObjectDefinitionResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateOembedDomainResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingDeleteOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetEventVisibilitySettingsResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetObjectDefinitionsByMediaTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetObjectDefinitionsByMediaTypeResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetOembedDomainResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingListOembedDomainsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingListOembedDomainsResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingRegisterAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingRegisterAppNameResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateAppNameResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateEventVisibilitySettingsResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateOembedDomainResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IntegratorSettingServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : IntegratorSettingServiceAsync {

    private val withRawResponse: IntegratorSettingServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntegratorSettingServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): IntegratorSettingServiceAsync =
        IntegratorSettingServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createObjectDefinition(
        params: IntegratorSettingCreateObjectDefinitionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingCreateObjectDefinitionResponse> =
        // post /media-bridge/v1/{appId}/settings/object-definitions
        withRawResponse().createObjectDefinition(params, requestOptions).thenApply { it.parse() }

    override fun createOembedDomain(
        params: IntegratorSettingCreateOembedDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingCreateOembedDomainResponse> =
        // post /media-bridge/v1/{appId}/settings/oembed-domains
        withRawResponse().createOembedDomain(params, requestOptions).thenApply { it.parse() }

    override fun deleteOembedDomain(
        params: IntegratorSettingDeleteOembedDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media-bridge/v1/{appId}/settings/oembed-domains
        withRawResponse().deleteOembedDomain(params, requestOptions).thenAccept {}

    override fun getEventVisibilitySettings(
        params: IntegratorSettingGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingGetEventVisibilitySettingsResponse> =
        // get /media-bridge/v1/{appId}/settings/event-visibility
        withRawResponse().getEventVisibilitySettings(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getObjectDefinitionsByMediaType(
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> =
        // get /media-bridge/v1/{appId}/settings/object-definitions/{mediaType}
        withRawResponse().getObjectDefinitionsByMediaType(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getOembedDomain(
        params: IntegratorSettingGetOembedDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingGetOembedDomainResponse> =
        // get /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}
        withRawResponse().getOembedDomain(params, requestOptions).thenApply { it.parse() }

    override fun listOembedDomains(
        params: IntegratorSettingListOembedDomainsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingListOembedDomainsResponse> =
        // get /media-bridge/v1/{appId}/settings/oembed-domains
        withRawResponse().listOembedDomains(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun registerAppName(
        params: IntegratorSettingRegisterAppNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingRegisterAppNameResponse> =
        // post /media-bridge/v1/{appId}/settings/register
        withRawResponse().registerAppName(params, requestOptions).thenApply { it.parse() }

    override fun updateAppName(
        params: IntegratorSettingUpdateAppNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingUpdateAppNameResponse> =
        // put /media-bridge/v1/{appId}/settings
        withRawResponse().updateAppName(params, requestOptions).thenApply { it.parse() }

    override fun updateEventVisibilitySettings(
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingUpdateEventVisibilitySettingsResponse> =
        // patch /media-bridge/v1/{appId}/settings/event-visibility
        withRawResponse().updateEventVisibilitySettings(params, requestOptions).thenApply {
            it.parse()
        }

    override fun updateOembedDomain(
        params: IntegratorSettingUpdateOembedDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorSettingUpdateOembedDomainResponse> =
        // patch /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}
        withRawResponse().updateOembedDomain(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegratorSettingServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegratorSettingServiceAsync.WithRawResponse =
            IntegratorSettingServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createObjectDefinitionHandler:
            Handler<IntegratorSettingCreateObjectDefinitionResponse> =
            jsonHandler<IntegratorSettingCreateObjectDefinitionResponse>(clientOptions.jsonMapper)

        override fun createObjectDefinition(
            params: IntegratorSettingCreateObjectDefinitionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "object-definitions",
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
                            .use { createObjectDefinitionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createOembedDomainHandler:
            Handler<IntegratorSettingCreateOembedDomainResponse> =
            jsonHandler<IntegratorSettingCreateOembedDomainResponse>(clientOptions.jsonMapper)

        override fun createOembedDomain(
            params: IntegratorSettingCreateOembedDomainParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingCreateOembedDomainResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "oembed-domains",
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
                            .use { createOembedDomainHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteOembedDomainHandler: Handler<Void?> = emptyHandler()

        override fun deleteOembedDomain(
            params: IntegratorSettingDeleteOembedDomainParams,
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
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "oembed-domains",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteOembedDomainHandler.handle(it) }
                    }
                }
        }

        private val getEventVisibilitySettingsHandler:
            Handler<IntegratorSettingGetEventVisibilitySettingsResponse> =
            jsonHandler<IntegratorSettingGetEventVisibilitySettingsResponse>(
                clientOptions.jsonMapper
            )

        override fun getEventVisibilitySettings(
            params: IntegratorSettingGetEventVisibilitySettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "event-visibility",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getEventVisibilitySettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getObjectDefinitionsByMediaTypeHandler:
            Handler<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> =
            jsonHandler<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse>(
                clientOptions.jsonMapper
            )

        override fun getObjectDefinitionsByMediaType(
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaType", params.mediaType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "object-definitions",
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
                            .use { getObjectDefinitionsByMediaTypeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getOembedDomainHandler: Handler<IntegratorSettingGetOembedDomainResponse> =
            jsonHandler<IntegratorSettingGetOembedDomainResponse>(clientOptions.jsonMapper)

        override fun getOembedDomain(
            params: IntegratorSettingGetOembedDomainParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingGetOembedDomainResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("oEmbedDomainId", params.oEmbedDomainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "oembed-domains",
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
                            .use { getOembedDomainHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listOembedDomainsHandler: Handler<IntegratorSettingListOembedDomainsResponse> =
            jsonHandler<IntegratorSettingListOembedDomainsResponse>(clientOptions.jsonMapper)

        override fun listOembedDomains(
            params: IntegratorSettingListOembedDomainsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingListOembedDomainsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "oembed-domains",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listOembedDomainsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val registerAppNameHandler: Handler<IntegratorSettingRegisterAppNameResponse> =
            jsonHandler<IntegratorSettingRegisterAppNameResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun registerAppName(
            params: IntegratorSettingRegisterAppNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingRegisterAppNameResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "register",
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
                            .use { registerAppNameHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateAppNameHandler: Handler<IntegratorSettingUpdateAppNameResponse> =
            jsonHandler<IntegratorSettingUpdateAppNameResponse>(clientOptions.jsonMapper)

        override fun updateAppName(
            params: IntegratorSettingUpdateAppNameParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateAppNameResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "v1", params._pathParam(0), "settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateAppNameHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateEventVisibilitySettingsHandler:
            Handler<IntegratorSettingUpdateEventVisibilitySettingsResponse> =
            jsonHandler<IntegratorSettingUpdateEventVisibilitySettingsResponse>(
                clientOptions.jsonMapper
            )

        override fun updateEventVisibilitySettings(
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "event-visibility",
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
                            .use { updateEventVisibilitySettingsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateOembedDomainHandler:
            Handler<IntegratorSettingUpdateOembedDomainResponse> =
            jsonHandler<IntegratorSettingUpdateOembedDomainResponse>(clientOptions.jsonMapper)

        override fun updateOembedDomain(
            params: IntegratorSettingUpdateOembedDomainParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("oEmbedDomainId", params.oEmbedDomainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "oembed-domains",
                        params._pathParam(1),
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
                            .use { updateOembedDomainHandler.handle(it) }
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
