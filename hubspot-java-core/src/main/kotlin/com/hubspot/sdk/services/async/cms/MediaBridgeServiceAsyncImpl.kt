// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.async.cms

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
import com.hubspot.sdk.core.prepareAsync
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
import com.hubspot.sdk.services.async.cms.mediabridge.BatchServiceAsync
import com.hubspot.sdk.services.async.cms.mediabridge.BatchServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class MediaBridgeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    MediaBridgeServiceAsync {

    private val withRawResponse: MediaBridgeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val batch: BatchServiceAsync by lazy { BatchServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): MediaBridgeServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): MediaBridgeServiceAsync =
        MediaBridgeServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun batch(): BatchServiceAsync = batch

    override fun createAssociation(
        params: MediaBridgeCreateAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociationDefinition> =
        // post /media-bridge/2026-03/{appId}/schemas/{objectType}/associations
        withRawResponse().createAssociation(params, requestOptions).thenApply { it.parse() }

    override fun createAttentionSpanEvent(
        params: MediaBridgeCreateAttentionSpanEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AttentionSpanEvent> =
        // post /media-bridge/2026-03/events/attention-span
        withRawResponse().createAttentionSpanEvent(params, requestOptions).thenApply { it.parse() }

    override fun createMediaPlayedEvent(
        params: MediaBridgeCreateMediaPlayedEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaPlayedEvent> =
        // post /media-bridge/2026-03/events/media-played
        withRawResponse().createMediaPlayedEvent(params, requestOptions).thenApply { it.parse() }

    override fun createMediaPlayedPercentEvent(
        params: MediaBridgeCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaPlayedPercentageEvent> =
        // post /media-bridge/2026-03/events/media-played-percent
        withRawResponse().createMediaPlayedPercentEvent(params, requestOptions).thenApply {
            it.parse()
        }

    override fun createObjectType(
        params: MediaBridgeCreateObjectTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BulkIntegratorObjectCreationResponse> =
        // post /media-bridge/2026-03/{appId}/settings/object-definitions
        withRawResponse().createObjectType(params, requestOptions).thenApply { it.parse() }

    override fun createOembedDomain(
        params: MediaBridgeCreateOembedDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        // post /media-bridge/2026-03/{appId}/settings/oembed-domains
        withRawResponse().createOembedDomain(params, requestOptions).thenApply { it.parse() }

    override fun createProperty(
        params: MediaBridgeCreatePropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeProperty> =
        // post /media-bridge/2026-03/{appId}/properties/{objectType}
        withRawResponse().createProperty(params, requestOptions).thenApply { it.parse() }

    override fun createPropertyGroup(
        params: MediaBridgeCreatePropertyGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyGroup> =
        // post /media-bridge/2026-03/{appId}/properties/{objectType}/groups
        withRawResponse().createPropertyGroup(params, requestOptions).thenApply { it.parse() }

    override fun createVideoAssociationDefinition(
        params: MediaBridgeCreateVideoAssociationDefinitionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociationDefinition> =
        // post /media-bridge/2026-03/{appId}/settings/video-association-definition
        withRawResponse().createVideoAssociationDefinition(params, requestOptions).thenApply {
            it.parse()
        }

    override fun deleteAssociation(
        params: MediaBridgeDeleteAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media-bridge/2026-03/{appId}/schemas/{objectType}/associations/{associationId}
        withRawResponse().deleteAssociation(params, requestOptions).thenAccept {}

    override fun deleteOembedDomain(
        params: MediaBridgeDeleteOembedDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media-bridge/2026-03/{appId}/settings/oembed-domains
        withRawResponse().deleteOembedDomain(params, requestOptions).thenAccept {}

    override fun deleteProperty(
        params: MediaBridgeDeletePropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().deleteProperty(params, requestOptions).thenAccept {}

    override fun deletePropertyGroup(
        params: MediaBridgeDeletePropertyGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().deletePropertyGroup(params, requestOptions).thenAccept {}

    override fun getEventVisibilitySettings(
        params: MediaBridgeGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventVisibilityResponse> =
        // get /media-bridge/2026-03/{appId}/settings/event-visibility
        withRawResponse().getEventVisibilitySettings(params, requestOptions).thenApply {
            it.parse()
        }

    override fun getOembedDomain(
        params: MediaBridgeGetOembedDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        // get /media-bridge/2026-03/{appId}/settings/oembed-domains/{oEmbedDomainId}
        withRawResponse().getOembedDomain(params, requestOptions).thenApply { it.parse() }

    override fun getProperty(
        params: MediaBridgeGetPropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeProperty> =
        // get /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().getProperty(params, requestOptions).thenApply { it.parse() }

    override fun getPropertyGroup(
        params: MediaBridgeGetPropertyGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyGroup> =
        // get /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().getPropertyGroup(params, requestOptions).thenApply { it.parse() }

    override fun getSchema(
        params: MediaBridgeGetSchemaParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectSchema> =
        // get /media-bridge/2026-03/{appId}/schemas/{objectType}
        withRawResponse().getSchema(params, requestOptions).thenApply { it.parse() }

    override fun listObjectTypesByMediaType(
        params: MediaBridgeListObjectTypesByMediaTypeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectDefinitionResponse> =
        // get /media-bridge/2026-03/{appId}/settings/object-definitions/{mediaType}
        withRawResponse().listObjectTypesByMediaType(params, requestOptions).thenApply {
            it.parse()
        }

    override fun listOembedDomains(
        params: MediaBridgeListOembedDomainsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        // get /media-bridge/2026-03/{appId}/settings/oembed-domains
        withRawResponse().listOembedDomains(params, requestOptions).thenApply { it.parse() }

    override fun listProperties(
        params: MediaBridgeListPropertiesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePropertyNoPaging> =
        // get /media-bridge/2026-03/{appId}/properties/{objectType}
        withRawResponse().listProperties(params, requestOptions).thenApply { it.parse() }

    override fun listPropertyGroups(
        params: MediaBridgeListPropertyGroupsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponsePropertyGroupNoPaging> =
        // get /media-bridge/2026-03/{appId}/properties/{objectType}/groups
        withRawResponse().listPropertyGroups(params, requestOptions).thenApply { it.parse() }

    override fun listSchemas(
        params: MediaBridgeListSchemasParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseObjectSchemaNoPaging> =
        // get /media-bridge/2026-03/{appId}/schemas
        withRawResponse().listSchemas(params, requestOptions).thenApply { it.parse() }

    @Deprecated("deprecated")
    override fun registerAppName(
        params: MediaBridgeRegisterAppNameParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        // post /media-bridge/2026-03/{appId}/settings/register
        withRawResponse().registerAppName(params, requestOptions).thenApply { it.parse() }

    override fun updateEventVisibilitySettings(
        params: MediaBridgeUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventVisibilityChange> =
        // patch /media-bridge/2026-03/{appId}/settings/event-visibility
        withRawResponse().updateEventVisibilitySettings(params, requestOptions).thenApply {
            it.parse()
        }

    override fun updateOembedDomain(
        params: MediaBridgeUpdateOembedDomainParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        // patch /media-bridge/2026-03/{appId}/settings/oembed-domains/{oEmbedDomainId}
        withRawResponse().updateOembedDomain(params, requestOptions).thenApply { it.parse() }

    override fun updateProperty(
        params: MediaBridgeUpdatePropertyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeProperty> =
        // patch /media-bridge/2026-03/{appId}/properties/{objectType}/{propertyName}
        withRawResponse().updateProperty(params, requestOptions).thenApply { it.parse() }

    override fun updatePropertyGroup(
        params: MediaBridgeUpdatePropertyGroupParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PropertyGroup> =
        // patch /media-bridge/2026-03/{appId}/properties/{objectType}/groups/{groupName}
        withRawResponse().updatePropertyGroup(params, requestOptions).thenApply { it.parse() }

    override fun updateSchema(
        params: MediaBridgeUpdateSchemaParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ObjectTypeDefinition> =
        // patch /media-bridge/2026-03/{appId}/schemas/{objectType}
        withRawResponse().updateSchema(params, requestOptions).thenApply { it.parse() }

    override fun updateSettings(
        params: MediaBridgeUpdateSettingsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        // put /media-bridge/2026-03/{appId}/settings
        withRawResponse().updateSettings(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MediaBridgeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val batch: BatchServiceAsync.WithRawResponse by lazy {
            BatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MediaBridgeServiceAsync.WithRawResponse =
            MediaBridgeServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun batch(): BatchServiceAsync.WithRawResponse = batch

        private val createAssociationHandler: Handler<AssociationDefinition> =
            jsonHandler<AssociationDefinition>(clientOptions.jsonMapper)

        override fun createAssociation(
            params: MediaBridgeCreateAssociationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAssociationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createAttentionSpanEventHandler: Handler<AttentionSpanEvent> =
            jsonHandler<AttentionSpanEvent>(clientOptions.jsonMapper)

        override fun createAttentionSpanEvent(
            params: MediaBridgeCreateAttentionSpanEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AttentionSpanEvent>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "attention-span")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createAttentionSpanEventHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createMediaPlayedEventHandler: Handler<MediaPlayedEvent> =
            jsonHandler<MediaPlayedEvent>(clientOptions.jsonMapper)

        override fun createMediaPlayedEvent(
            params: MediaBridgeCreateMediaPlayedEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaPlayedEvent>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "media-played")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createMediaPlayedEventHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createMediaPlayedPercentEventHandler: Handler<MediaPlayedPercentageEvent> =
            jsonHandler<MediaPlayedPercentageEvent>(clientOptions.jsonMapper)

        override fun createMediaPlayedPercentEvent(
            params: MediaBridgeCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaPlayedPercentageEvent>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "media-played-percent")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createMediaPlayedPercentEventHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createObjectTypeHandler: Handler<BulkIntegratorObjectCreationResponse> =
            jsonHandler<BulkIntegratorObjectCreationResponse>(clientOptions.jsonMapper)

        override fun createObjectType(
            params: MediaBridgeCreateObjectTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createObjectTypeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createOembedDomainHandler: Handler<IntegratorOEmbedDomainModel> =
            jsonHandler<IntegratorOEmbedDomainModel>(clientOptions.jsonMapper)

        override fun createOembedDomain(
            params: MediaBridgeCreateOembedDomainParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> {
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

        private val createPropertyHandler: Handler<MediaBridgeProperty> =
            jsonHandler<MediaBridgeProperty>(clientOptions.jsonMapper)

        override fun createProperty(
            params: MediaBridgeCreatePropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createPropertyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createPropertyGroupHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun createPropertyGroup(
            params: MediaBridgeCreatePropertyGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createPropertyGroupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val createVideoAssociationDefinitionHandler: Handler<AssociationDefinition> =
            jsonHandler<AssociationDefinition>(clientOptions.jsonMapper)

        override fun createVideoAssociationDefinition(
            params: MediaBridgeCreateVideoAssociationDefinitionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AssociationDefinition>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createVideoAssociationDefinitionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deleteAssociationHandler: Handler<Void?> = emptyHandler()

        override fun deleteAssociation(
            params: MediaBridgeDeleteAssociationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteAssociationHandler.handle(it) }
                    }
                }
        }

        private val deleteOembedDomainHandler: Handler<Void?> = emptyHandler()

        override fun deleteOembedDomain(
            params: MediaBridgeDeleteOembedDomainParams,
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
                        "2026-03",
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

        private val deletePropertyHandler: Handler<Void?> = emptyHandler()

        override fun deleteProperty(
            params: MediaBridgeDeletePropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deletePropertyHandler.handle(it) }
                    }
                }
        }

        private val deletePropertyGroupHandler: Handler<Void?> = emptyHandler()

        override fun deletePropertyGroup(
            params: MediaBridgeDeletePropertyGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deletePropertyGroupHandler.handle(it) }
                    }
                }
        }

        private val getEventVisibilitySettingsHandler: Handler<EventVisibilityResponse> =
            jsonHandler<EventVisibilityResponse>(clientOptions.jsonMapper)

        override fun getEventVisibilitySettings(
            params: MediaBridgeGetEventVisibilitySettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> {
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

        private val getOembedDomainHandler: Handler<IntegratorOEmbedDomainModel> =
            jsonHandler<IntegratorOEmbedDomainModel>(clientOptions.jsonMapper)

        override fun getOembedDomain(
            params: MediaBridgeGetOembedDomainParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> {
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

        private val getPropertyHandler: Handler<MediaBridgeProperty> =
            jsonHandler<MediaBridgeProperty>(clientOptions.jsonMapper)

        override fun getProperty(
            params: MediaBridgeGetPropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPropertyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getPropertyGroupHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun getPropertyGroup(
            params: MediaBridgeGetPropertyGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getPropertyGroupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSchemaHandler: Handler<ObjectSchema> =
            jsonHandler<ObjectSchema>(clientOptions.jsonMapper)

        override fun getSchema(
            params: MediaBridgeGetSchemaParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectSchema>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSchemaHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listObjectTypesByMediaTypeHandler: Handler<ObjectDefinitionResponse> =
            jsonHandler<ObjectDefinitionResponse>(clientOptions.jsonMapper)

        override fun listObjectTypesByMediaType(
            params: MediaBridgeListObjectTypesByMediaTypeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listObjectTypesByMediaTypeHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listOembedDomainsHandler: Handler<OEmbedDomainsCollectionResponse> =
            jsonHandler<OEmbedDomainsCollectionResponse>(clientOptions.jsonMapper)

        override fun listOembedDomains(
            params: MediaBridgeListOembedDomainsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> {
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

        private val listPropertiesHandler: Handler<CollectionResponsePropertyNoPaging> =
            jsonHandler<CollectionResponsePropertyNoPaging>(clientOptions.jsonMapper)

        override fun listProperties(
            params: MediaBridgeListPropertiesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyNoPaging>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPropertiesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listPropertyGroupsHandler: Handler<CollectionResponsePropertyGroupNoPaging> =
            jsonHandler<CollectionResponsePropertyGroupNoPaging>(clientOptions.jsonMapper)

        override fun listPropertyGroups(
            params: MediaBridgeListPropertyGroupsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponsePropertyGroupNoPaging>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPropertyGroupsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listSchemasHandler: Handler<CollectionResponseObjectSchemaNoPaging> =
            jsonHandler<CollectionResponseObjectSchemaNoPaging>(clientOptions.jsonMapper)

        override fun listSchemas(
            params: MediaBridgeListSchemasParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseObjectSchemaNoPaging>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("appId", params.appId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", params._pathParam(0), "schemas")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSchemasHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> {
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

        private val updateEventVisibilitySettingsHandler: Handler<EventVisibilityChange> =
            jsonHandler<EventVisibilityChange>(clientOptions.jsonMapper)

        override fun updateEventVisibilitySettings(
            params: MediaBridgeUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>> {
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

        private val updateOembedDomainHandler: Handler<IntegratorOEmbedDomainModel> =
            jsonHandler<IntegratorOEmbedDomainModel>(clientOptions.jsonMapper)

        override fun updateOembedDomain(
            params: MediaBridgeUpdateOembedDomainParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> {
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

        private val updatePropertyHandler: Handler<MediaBridgeProperty> =
            jsonHandler<MediaBridgeProperty>(clientOptions.jsonMapper)

        override fun updateProperty(
            params: MediaBridgeUpdatePropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProperty>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updatePropertyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updatePropertyGroupHandler: Handler<PropertyGroup> =
            jsonHandler<PropertyGroup>(clientOptions.jsonMapper)

        override fun updatePropertyGroup(
            params: MediaBridgeUpdatePropertyGroupParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PropertyGroup>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updatePropertyGroupHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateSchemaHandler: Handler<ObjectTypeDefinition> =
            jsonHandler<ObjectTypeDefinition>(clientOptions.jsonMapper)

        override fun updateSchema(
            params: MediaBridgeUpdateSchemaParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ObjectTypeDefinition>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateSchemaHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateSettingsHandler: Handler<MediaBridgeProviderRegistrationResponse> =
            jsonHandler<MediaBridgeProviderRegistrationResponse>(clientOptions.jsonMapper)

        override fun updateSettings(
            params: MediaBridgeUpdateSettingsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
}
