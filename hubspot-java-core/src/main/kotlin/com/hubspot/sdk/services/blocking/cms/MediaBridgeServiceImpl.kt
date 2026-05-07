// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms

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
import com.hubspot.sdk.models.AssociationDefinition
import com.hubspot.sdk.models.CollectionResponsePropertyGroupNoPaging
import com.hubspot.sdk.models.ObjectTypeDefinition
import com.hubspot.sdk.models.PropertyGroup
import com.hubspot.sdk.models.cms.mediabridge.AttentionSpanEvent
import com.hubspot.sdk.models.cms.mediabridge.BulkIntegratorObjectCreationResponse
import com.hubspot.sdk.models.cms.mediabridge.CollectionResponseObjectSchemaNoPaging
import com.hubspot.sdk.models.cms.mediabridge.CollectionResponsePropertyNoPaging
import com.hubspot.sdk.models.cms.mediabridge.EventVisibilityChange
import com.hubspot.sdk.models.cms.mediabridge.EventVisibilityResponse
import com.hubspot.sdk.models.cms.mediabridge.IntegratorOEmbedDomainModel
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateAssociationParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateAttentionSpanEventParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateMediaPlayedEventParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateMediaPlayedPercentEventParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateObjectTypeParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreatePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreatePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeCreateVideoAssociationDefinitionParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeleteAssociationParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeleteOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeletePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeDeletePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetEventVisibilitySettingsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetPropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetPropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeGetSchemaParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListObjectTypesByMediaTypeParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListOembedDomainsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListPropertiesParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListPropertyGroupsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeListSchemasParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeProperty
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeProviderRegistrationResponse
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeRegisterAppNameParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateEventVisibilitySettingsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateOembedDomainParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdatePropertyGroupParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdatePropertyParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateSchemaParams
import com.hubspot.sdk.models.cms.mediabridge.MediaBridgeUpdateSettingsParams
import com.hubspot.sdk.models.cms.mediabridge.MediaPlayedEvent
import com.hubspot.sdk.models.cms.mediabridge.MediaPlayedPercentageEvent
import com.hubspot.sdk.models.cms.mediabridge.OEmbedDomainsCollectionResponse
import com.hubspot.sdk.models.cms.mediabridge.ObjectDefinitionResponse
import com.hubspot.sdk.models.cms.mediabridge.ObjectSchema
import com.hubspot.sdk.services.blocking.cms.mediabridge.BatchService
import com.hubspot.sdk.services.blocking.cms.mediabridge.BatchServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MediaBridgeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaBridgeService {

    private val withRawResponse: MediaBridgeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchService by lazy { BatchServiceImpl(clientOptions) }

    override fun withRawResponse(): MediaBridgeService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaBridgeService =
        MediaBridgeServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchService = batch

    override fun createAssociation(
        params: MediaBridgeCreateAssociationParams,
        requestOptions: RequestOptions,
    ): AssociationDefinition =
        // post /media-bridge/2026-03/{appId}/schemas/{objectType}/associations
        withRawResponse().createAssociation(params, requestOptions).parse()

    override fun createAttentionSpanEvent(
        params: MediaBridgeCreateAttentionSpanEventParams,
        requestOptions: RequestOptions,
    ): AttentionSpanEvent =
        // post /media-bridge/2026-03/events/attention-span
        withRawResponse().createAttentionSpanEvent(params, requestOptions).parse()

    override fun createMediaPlayedEvent(
        params: MediaBridgeCreateMediaPlayedEventParams,
        requestOptions: RequestOptions,
    ): MediaPlayedEvent =
        // post /media-bridge/2026-03/events/media-played
        withRawResponse().createMediaPlayedEvent(params, requestOptions).parse()

    override fun createMediaPlayedPercentEvent(
        params: MediaBridgeCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions,
    ): MediaPlayedPercentageEvent =
        // post /media-bridge/2026-03/events/media-played-percent
        withRawResponse().createMediaPlayedPercentEvent(params, requestOptions).parse()

    override fun createObjectType(
        params: MediaBridgeCreateObjectTypeParams,
        requestOptions: RequestOptions,
    ): BulkIntegratorObjectCreationResponse =
        // post /media-bridge/2026-03/{appId}/settings/object-definitions
        withRawResponse().createObjectType(params, requestOptions).parse()

    override fun createOembedDomain(
        params: MediaBridgeCreateOembedDomainParams,
        requestOptions: RequestOptions,
    ): IntegratorOEmbedDomainModel =
        // post /media-bridge/2026-03/{appId}/settings/oembed-domains
        withRawResponse().createOembedDomain(params, requestOptions).parse()

    override fun createProperty(
        params: MediaBridgeCreatePropertyParams,
        requestOptions: RequestOptions,
    ): MediaBridgeProperty =
        // post /media-bridge/2026-03/{appId}/properties/{objectType}
        withRawResponse().createProperty(params, requestOptions).parse()

    override fun createPropertyGroup(
        params: MediaBridgeCreatePropertyGroupParams,
        requestOptions: RequestOptions,
    ): PropertyGroup =
        // post /media-bridge/2026-03/{appId}/properties/{objectType}/groups
        withRawResponse().createPropertyGroup(params, requestOptions).parse()

    override fun createVideoAssociationDefinition(
        params: MediaBridgeCreateVideoAssociationDefinitionParams,
        requestOptions: RequestOptions,
    ): AssociationDefinition =
        // post /media-bridge/2026-03/{appId}/settings/video-association-definition
        withRawResponse().createVideoAssociationDefinition(params, requestOptions).parse()

    override fun deleteAssociation(
        params: MediaBridgeDeleteAssociationParams,
        requestOptions: RequestOptions,
    ) {
        // delete /media-bridge/2026-03/{appId}/schemas/{objectType}/associations/{associationId}
        withRawResponse().deleteAssociation(params, requestOptions)
    }

    override fun deleteOembedDomain(
        params: MediaBridgeDeleteOembedDomainParams,
        requestOptions: RequestOptions,
    ) {
        // delete /media-bridge/2026-03/{appId}/settings/oembed-domains
        withRawResponse().deleteOembedDomain(params, requestOptions)
    }

    override fun deleteProperty(
        params: MediaBridgeDeletePropertyParams,
        requestOptions: RequestOptions,
    ) {
        // delete /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().deleteProperty(params, requestOptions)
    }

    override fun deletePropertyGroup(
        params: MediaBridgeDeletePropertyGroupParams,
        requestOptions: RequestOptions,
    ) {
        // delete /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().deletePropertyGroup(params, requestOptions)
    }

    override fun getEventVisibilitySettings(
        params: MediaBridgeGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions,
    ): EventVisibilityResponse =
        // get /media-bridge/2026-03/{appId}/settings/event-visibility
        withRawResponse().getEventVisibilitySettings(params, requestOptions).parse()

    override fun getOembedDomain(
        params: MediaBridgeGetOembedDomainParams,
        requestOptions: RequestOptions,
    ): IntegratorOEmbedDomainModel =
        // get /media-bridge/2026-03/{appId}/settings/oembed-domains/{oEmbedDomainId}
        withRawResponse().getOembedDomain(params, requestOptions).parse()

    override fun getProperty(
        params: MediaBridgeGetPropertyParams,
        requestOptions: RequestOptions,
    ): MediaBridgeProperty =
        // get /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().getProperty(params, requestOptions).parse()

    override fun getPropertyGroup(
        params: MediaBridgeGetPropertyGroupParams,
        requestOptions: RequestOptions,
    ): PropertyGroup =
        // get /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().getPropertyGroup(params, requestOptions).parse()

    override fun getSchema(
        params: MediaBridgeGetSchemaParams,
        requestOptions: RequestOptions,
    ): ObjectSchema =
        // get /media-bridge/2026-03/{appId}/schemas/{objectType}
        withRawResponse().getSchema(params, requestOptions).parse()

    override fun listObjectTypesByMediaType(
        params: MediaBridgeListObjectTypesByMediaTypeParams,
        requestOptions: RequestOptions,
    ): ObjectDefinitionResponse =
        // get /media-bridge/2026-03/{appId}/settings/object-definitions/{mediaType}
        withRawResponse().listObjectTypesByMediaType(params, requestOptions).parse()

    override fun listOembedDomains(
        params: MediaBridgeListOembedDomainsParams,
        requestOptions: RequestOptions,
    ): OEmbedDomainsCollectionResponse =
        // get /media-bridge/2026-03/{appId}/settings/oembed-domains
        withRawResponse().listOembedDomains(params, requestOptions).parse()

    override fun listProperties(
        params: MediaBridgeListPropertiesParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePropertyNoPaging =
        // get /media-bridge/2026-03/{appId}/properties/{objectType}
        withRawResponse().listProperties(params, requestOptions).parse()

    override fun listPropertyGroups(
        params: MediaBridgeListPropertyGroupsParams,
        requestOptions: RequestOptions,
    ): CollectionResponsePropertyGroupNoPaging =
        // get /media-bridge/2026-03/{appId}/properties/{objectType}/groups
        withRawResponse().listPropertyGroups(params, requestOptions).parse()

    override fun listSchemas(
        params: MediaBridgeListSchemasParams,
        requestOptions: RequestOptions,
    ): CollectionResponseObjectSchemaNoPaging =
        // get /media-bridge/2026-03/{appId}/schemas
        withRawResponse().listSchemas(params, requestOptions).parse()

    @Deprecated("deprecated")
    override fun registerAppName(
        params: MediaBridgeRegisterAppNameParams,
        requestOptions: RequestOptions,
    ): MediaBridgeProviderRegistrationResponse =
        // post /media-bridge/2026-03/{appId}/settings/register
        withRawResponse().registerAppName(params, requestOptions).parse()

    override fun updateEventVisibilitySettings(
        params: MediaBridgeUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions,
    ): EventVisibilityChange =
        // patch /media-bridge/2026-03/{appId}/settings/event-visibility
        withRawResponse().updateEventVisibilitySettings(params, requestOptions).parse()

    override fun updateOembedDomain(
        params: MediaBridgeUpdateOembedDomainParams,
        requestOptions: RequestOptions,
    ): IntegratorOEmbedDomainModel =
        // patch /media-bridge/2026-03/{appId}/settings/oembed-domains/{oEmbedDomainId}
        withRawResponse().updateOembedDomain(params, requestOptions).parse()

    override fun updateProperty(
        params: MediaBridgeUpdatePropertyParams,
        requestOptions: RequestOptions,
    ): MediaBridgeProperty =
        // patch /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().updateProperty(params, requestOptions).parse()

    override fun updatePropertyGroup(
        params: MediaBridgeUpdatePropertyGroupParams,
        requestOptions: RequestOptions,
    ): PropertyGroup =
        // patch /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().updatePropertyGroup(params, requestOptions).parse()

    override fun updateSchema(
        params: MediaBridgeUpdateSchemaParams,
        requestOptions: RequestOptions,
    ): ObjectTypeDefinition =
        // patch /media-bridge/2026-03/{appId}/schemas/{objectType}
        withRawResponse().updateSchema(params, requestOptions).parse()

    override fun updateSettings(
        params: MediaBridgeUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): MediaBridgeProviderRegistrationResponse =
        // put /media-bridge/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaBridgeService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchService.WithRawResponse by lazy {
            BatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaBridgeService.WithRawResponse =
            MediaBridgeServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchService.WithRawResponse = batch

        private val createAssociationHandler: Handler<AssociationDefinition> =
            jsonHandler<AssociationDefinition>(clientOptions.jsonMapper)

        override fun createAssociation(
            params: MediaBridgeCreateAssociationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociationDefinition> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "schemas",
                        params._pathParam(1),
                        "associations",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAssociationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createAttentionSpanEventHandler: Handler<AttentionSpanEvent> =
            jsonHandler<AttentionSpanEvent>(clientOptions.jsonMapper)

        override fun createAttentionSpanEvent(
            params: MediaBridgeCreateAttentionSpanEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AttentionSpanEvent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "attention-span")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createAttentionSpanEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createMediaPlayedEventHandler: Handler<MediaPlayedEvent> =
            jsonHandler<MediaPlayedEvent>(clientOptions.jsonMapper)

        override fun createMediaPlayedEvent(
            params: MediaBridgeCreateMediaPlayedEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaPlayedEvent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "media-played")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createMediaPlayedEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createMediaPlayedPercentEventHandler: Handler<MediaPlayedPercentageEvent> =
            jsonHandler<MediaPlayedPercentageEvent>(clientOptions.jsonMapper)

        override fun createMediaPlayedPercentEvent(
            params: MediaBridgeCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaPlayedPercentageEvent> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "media-played-percent")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createMediaPlayedPercentEventHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createObjectTypeHandler: Handler<BulkIntegratorObjectCreationResponse> =
            jsonHandler<BulkIntegratorObjectCreationResponse>(clientOptions.jsonMapper)

        override fun createObjectType(
            params: MediaBridgeCreateObjectTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BulkIntegratorObjectCreationResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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
                    .use { createObjectTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createOembedDomainHandler: Handler<IntegratorOEmbedDomainModel> =
            jsonHandler<IntegratorOEmbedDomainModel>(clientOptions.jsonMapper)

        override fun createOembedDomain(
            params: MediaBridgeCreateOembedDomainParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorOEmbedDomainModel> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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

        private val createPropertyHandler: Handler<MediaBridgeProperty> =
            jsonHandler<MediaBridgeProperty>(clientOptions.jsonMapper)

        override fun createProperty(
            params: MediaBridgeCreatePropertyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaBridgeProperty> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createPropertyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createPropertyGroupHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun createPropertyGroup(
            params: MediaBridgeCreatePropertyGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PropertyGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createPropertyGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val createVideoAssociationDefinitionHandler: Handler<AssociationDefinition> =
            jsonHandler<AssociationDefinition>(clientOptions.jsonMapper)

        override fun createVideoAssociationDefinition(
            params: MediaBridgeCreateVideoAssociationDefinitionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AssociationDefinition> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "settings",
                        "video-association-definition",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createVideoAssociationDefinitionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val deleteAssociationHandler: Handler<Void?> = emptyHandler()

        override fun deleteAssociation(
            params: MediaBridgeDeleteAssociationParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("associationId", params.associationId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "schemas",
                        params._pathParam(1),
                        "associations",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteAssociationHandler.handle(it) }
            }
        }

        private val deleteOembedDomainHandler: Handler<Void?> = emptyHandler()

        override fun deleteOembedDomain(
            params: MediaBridgeDeleteOembedDomainParams,
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
                        "2026-03",
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

        private val deletePropertyHandler: Handler<Void?> = emptyHandler()

        override fun deleteProperty(
            params: MediaBridgeDeletePropertyParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deletePropertyHandler.handle(it) }
            }
        }

        private val deletePropertyGroupHandler: Handler<Void?> = emptyHandler()

        override fun deletePropertyGroup(
            params: MediaBridgeDeletePropertyGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupName", params.groupName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                        params._pathParam(2),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deletePropertyGroupHandler.handle(it) }
            }
        }

        private val getEventVisibilitySettingsHandler: Handler<EventVisibilityResponse> =
            jsonHandler<EventVisibilityResponse>(clientOptions.jsonMapper)

        override fun getEventVisibilitySettings(
            params: MediaBridgeGetEventVisibilitySettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventVisibilityResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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

        private val getOembedDomainHandler: Handler<IntegratorOEmbedDomainModel> =
            jsonHandler<IntegratorOEmbedDomainModel>(clientOptions.jsonMapper)

        override fun getOembedDomain(
            params: MediaBridgeGetOembedDomainParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorOEmbedDomainModel> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("oEmbedDomainId", params.oEmbedDomainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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

        private val getPropertyHandler: Handler<MediaBridgeProperty> =
            jsonHandler<MediaBridgeProperty>(clientOptions.jsonMapper)

        override fun getProperty(
            params: MediaBridgeGetPropertyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaBridgeProperty> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPropertyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getPropertyGroupHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun getPropertyGroup(
            params: MediaBridgeGetPropertyGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PropertyGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupName", params.groupName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                        params._pathParam(2),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getPropertyGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val getSchemaHandler: Handler<ObjectSchema> =
            jsonHandler<ObjectSchema>(clientOptions.jsonMapper)

        override fun getSchema(
            params: MediaBridgeGetSchemaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectSchema> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "schemas",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { getSchemaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listObjectTypesByMediaTypeHandler: Handler<ObjectDefinitionResponse> =
            jsonHandler<ObjectDefinitionResponse>(clientOptions.jsonMapper)

        override fun listObjectTypesByMediaType(
            params: MediaBridgeListObjectTypesByMediaTypeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectDefinitionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaType", params.mediaType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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
                    .use { listObjectTypesByMediaTypeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listOembedDomainsHandler: Handler<OEmbedDomainsCollectionResponse> =
            jsonHandler<OEmbedDomainsCollectionResponse>(clientOptions.jsonMapper)

        override fun listOembedDomains(
            params: MediaBridgeListOembedDomainsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OEmbedDomainsCollectionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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

        private val listPropertiesHandler: Handler<CollectionResponsePropertyNoPaging> =
            jsonHandler<CollectionResponsePropertyNoPaging>(clientOptions.jsonMapper)

        override fun listProperties(
            params: MediaBridgeListPropertiesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePropertyNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPropertiesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPropertyGroupsHandler: Handler<CollectionResponsePropertyGroupNoPaging> =
            jsonHandler<CollectionResponsePropertyGroupNoPaging>(clientOptions.jsonMapper)

        override fun listPropertyGroups(
            params: MediaBridgeListPropertyGroupsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponsePropertyGroupNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPropertyGroupsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listSchemasHandler: Handler<CollectionResponseObjectSchemaNoPaging> =
            jsonHandler<CollectionResponseObjectSchemaNoPaging>(clientOptions.jsonMapper)

        override fun listSchemas(
            params: MediaBridgeListSchemasParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseObjectSchemaNoPaging> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", params._pathParam(0), "schemas")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSchemasHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val registerAppNameHandler: Handler<MediaBridgeProviderRegistrationResponse> =
            jsonHandler<MediaBridgeProviderRegistrationResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun registerAppName(
            params: MediaBridgeRegisterAppNameParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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

        private val updateEventVisibilitySettingsHandler: Handler<EventVisibilityChange> =
            jsonHandler<EventVisibilityChange>(clientOptions.jsonMapper)

        override fun updateEventVisibilitySettings(
            params: MediaBridgeUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventVisibilityChange> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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

        private val updateOembedDomainHandler: Handler<IntegratorOEmbedDomainModel> =
            jsonHandler<IntegratorOEmbedDomainModel>(clientOptions.jsonMapper)

        override fun updateOembedDomain(
            params: MediaBridgeUpdateOembedDomainParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntegratorOEmbedDomainModel> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("oEmbedDomainId", params.oEmbedDomainId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
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

        private val updatePropertyHandler: Handler<MediaBridgeProperty> =
            jsonHandler<MediaBridgeProperty>(clientOptions.jsonMapper)

        override fun updateProperty(
            params: MediaBridgeUpdatePropertyParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaBridgeProperty> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("propertyName", params.propertyName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        params._pathParam(2),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updatePropertyHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updatePropertyGroupHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun updatePropertyGroup(
            params: MediaBridgeUpdatePropertyGroupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PropertyGroup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("groupName", params.groupName().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "properties",
                        params._pathParam(1),
                        "groups",
                        params._pathParam(2),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updatePropertyGroupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateSchemaHandler: Handler<ObjectTypeDefinition> =
            jsonHandler<ObjectTypeDefinition>(clientOptions.jsonMapper)

        override fun updateSchema(
            params: MediaBridgeUpdateSchemaParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ObjectTypeDefinition> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectType", params.objectType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        params._pathParam(0),
                        "schemas",
                        params._pathParam(1),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateSchemaHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateSettingsHandler: Handler<MediaBridgeProviderRegistrationResponse> =
            jsonHandler<MediaBridgeProviderRegistrationResponse>(clientOptions.jsonMapper)

        override fun updateSettings(
            params: MediaBridgeUpdateSettingsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MediaBridgeProviderRegistrationResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", params._pathParam(0), "settings")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateSettingsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
