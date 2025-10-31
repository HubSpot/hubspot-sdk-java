// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.mediabridge

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
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class IntegratorSettingServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IntegratorSettingService {

    private val withRawResponse: IntegratorSettingService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntegratorSettingService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegratorSettingService =
        IntegratorSettingServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun createObjectDefinition(
        params: IntegratorSettingCreateObjectDefinitionParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingCreateObjectDefinitionResponse =
        // post /media-bridge/v1/{appId}/settings/object-definitions
        withRawResponse().createObjectDefinition(params, requestOptions).parse()

    override fun createOembedDomain(
        params: IntegratorSettingCreateOembedDomainParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingCreateOembedDomainResponse =
        // post /media-bridge/v1/{appId}/settings/oembed-domains
        withRawResponse().createOembedDomain(params, requestOptions).parse()

    override fun deleteOembedDomain(
        params: IntegratorSettingDeleteOembedDomainParams,
        requestOptions: RequestOptions,
    ) {
        // delete /media-bridge/v1/{appId}/settings/oembed-domains
        withRawResponse().deleteOembedDomain(params, requestOptions)
    }

    override fun getEventVisibilitySettings(
        params: IntegratorSettingGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingGetEventVisibilitySettingsResponse =
        // get /media-bridge/v1/{appId}/settings/event-visibility
        withRawResponse().getEventVisibilitySettings(params, requestOptions).parse()

    override fun getObjectDefinitionsByMediaType(
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingGetObjectDefinitionsByMediaTypeResponse =
        // get /media-bridge/v1/{appId}/settings/object-definitions/{mediaType}
        withRawResponse().getObjectDefinitionsByMediaType(params, requestOptions).parse()

    override fun getOembedDomain(
        params: IntegratorSettingGetOembedDomainParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingGetOembedDomainResponse =
        // get /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}
        withRawResponse().getOembedDomain(params, requestOptions).parse()

    override fun listOembedDomains(
        params: IntegratorSettingListOembedDomainsParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingListOembedDomainsResponse =
        // get /media-bridge/v1/{appId}/settings/oembed-domains
        withRawResponse().listOembedDomains(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun registerAppName(
        params: IntegratorSettingRegisterAppNameParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingRegisterAppNameResponse =
        // post /media-bridge/v1/{appId}/settings/register
        withRawResponse().registerAppName(params, requestOptions).parse()

    override fun updateAppName(
        params: IntegratorSettingUpdateAppNameParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingUpdateAppNameResponse =
        // put /media-bridge/v1/{appId}/settings
        withRawResponse().updateAppName(params, requestOptions).parse()

    override fun updateEventVisibilitySettings(
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingUpdateEventVisibilitySettingsResponse =
        // patch /media-bridge/v1/{appId}/settings/event-visibility
        withRawResponse().updateEventVisibilitySettings(params, requestOptions).parse()

    override fun updateOembedDomain(
        params: IntegratorSettingUpdateOembedDomainParams,
        requestOptions: RequestOptions,
    ): IntegratorSettingUpdateOembedDomainResponse =
        // patch /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}
        withRawResponse().updateOembedDomain(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntegratorSettingService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegratorSettingService.WithRawResponse =
            IntegratorSettingServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createObjectDefinitionHandler:
            Handler<IntegratorSettingCreateObjectDefinitionResponse> =
            jsonHandler<IntegratorSettingCreateObjectDefinitionResponse>(clientOptions.jsonMapper)

        override fun createObjectDefinition(
            params: IntegratorSettingCreateObjectDefinitionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorSettingCreateObjectDefinitionResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createObjectDefinitionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<IntegratorSettingCreateOembedDomainResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createOembedDomainHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteOembedDomainHandler: Handler<Void?> = emptyHandler()

        override fun deleteOembedDomain(
            params: IntegratorSettingDeleteOembedDomainParams,
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
                        "media-bridge",
                        "v1",
                        params._pathParam(0),
                        "settings",
                        "oembed-domains",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteOembedDomainHandler.handle(it) }
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
        ): HttpResponseFor<IntegratorSettingGetEventVisibilitySettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getEventVisibilitySettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<IntegratorSettingGetObjectDefinitionsByMediaTypeResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getObjectDefinitionsByMediaTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getOembedDomainHandler: Handler<IntegratorSettingGetOembedDomainResponse> =
            jsonHandler<IntegratorSettingGetOembedDomainResponse>(clientOptions.jsonMapper)

        override fun getOembedDomain(
            params: IntegratorSettingGetOembedDomainParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorSettingGetOembedDomainResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getOembedDomainHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listOembedDomainsHandler: Handler<IntegratorSettingListOembedDomainsResponse> =
            jsonHandler<IntegratorSettingListOembedDomainsResponse>(clientOptions.jsonMapper)

        override fun listOembedDomains(
            params: IntegratorSettingListOembedDomainsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorSettingListOembedDomainsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listOembedDomainsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<IntegratorSettingRegisterAppNameResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { registerAppNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateAppNameHandler: Handler<IntegratorSettingUpdateAppNameResponse> =
            jsonHandler<IntegratorSettingUpdateAppNameResponse>(clientOptions.jsonMapper)

        override fun updateAppName(
            params: IntegratorSettingUpdateAppNameParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorSettingUpdateAppNameResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateAppNameHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<IntegratorSettingUpdateEventVisibilitySettingsResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateEventVisibilitySettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<IntegratorSettingUpdateOembedDomainResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
