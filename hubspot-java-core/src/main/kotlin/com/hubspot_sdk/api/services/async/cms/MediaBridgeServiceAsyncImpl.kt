// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms

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
import com.hubspot_sdk.api.models.CollectionResponseObjectSchemaNoPaging
import com.hubspot_sdk.api.models.CollectionResponsePropertyGroupNoPaging
import com.hubspot_sdk.api.models.CollectionResponsePropertyNoPaging
import com.hubspot_sdk.api.models.ObjectSchema
import com.hubspot_sdk.api.models.ObjectTypeDefinition
import com.hubspot_sdk.api.models.Property
import com.hubspot_sdk.api.models.PropertyGroup
import com.hubspot_sdk.api.models.cms.mediabridge.BulkIntegratorObjectCreationResponse
import com.hubspot_sdk.api.models.cms.mediabridge.CollectionResponseMediaBridgeObjectForwardPaging
import com.hubspot_sdk.api.models.cms.mediabridge.EventVisibilityChange
import com.hubspot_sdk.api.models.cms.mediabridge.EventVisibilityResponse
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorOEmbedDomainModel
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateAttentionSpanEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateMediaPlayedEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateMediaPlayedPercentEventParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateObjectTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreatePropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreatePropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeCreateVideoAssociationDefinitionParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeleteAssociationParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeleteOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeleteParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeletePropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeDeletePropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetPropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetPropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeGetSchemaParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListObjectTypesByMediaTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListOembedDomainsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListPageAsync
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListPropertiesParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListPropertyGroupsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeListSchemasParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeObject
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeProviderRegistrationResponse
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeRegisterAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdatePropertyGroupParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdatePropertyParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateSchemaParams
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeUpdateSettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.OEmbedDomainsCollectionResponse
import com.hubspot_sdk.api.models.cms.mediabridge.ObjectDefinitionResponse
import com.hubspot_sdk.api.models.events.AssociationDefinition
import com.hubspot_sdk.api.services.async.cms.mediabridge.BatchServiceAsync
import com.hubspot_sdk.api.services.async.cms.mediabridge.BatchServiceAsyncImpl
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

    override fun create(
        params: MediaBridgeCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeObject> =
        // post /media-bridge/2026-03/objects
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: MediaBridgeUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeObject> =
        // patch /media-bridge/2026-03/objects/{objectId}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: MediaBridgeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeListPageAsync> =
        // get /media-bridge/2026-03/objects/{mediaType}
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: MediaBridgeDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /media-bridge/2026-03/objects/{mediaType}/{objectId}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun createAssociation(
        params: MediaBridgeCreateAssociationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AssociationDefinition> =
        // post /media-bridge/2026-03/{appId}/schemas/{objectType}/associations
        withRawResponse().createAssociation(params, requestOptions).thenApply { it.parse() }

    override fun createAttentionSpanEvent(
        params: MediaBridgeCreateAttentionSpanEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /media-bridge/2026-03/events/attention-span
        withRawResponse().createAttentionSpanEvent(params, requestOptions)

    override fun createMediaPlayedEvent(
        params: MediaBridgeCreateMediaPlayedEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /media-bridge/2026-03/events/media-played
        withRawResponse().createMediaPlayedEvent(params, requestOptions)

    override fun createMediaPlayedPercentEvent(
        params: MediaBridgeCreateMediaPlayedPercentEventParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        // post /media-bridge/2026-03/events/media-played-percent
        withRawResponse().createMediaPlayedPercentEvent(params, requestOptions)

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
    ): CompletableFuture<Property> =
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

    override fun get(
        params: MediaBridgeGetParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MediaBridgeObject> =
        // get /media-bridge/2026-03/objects/{mediaType}/{objectId}
        withRawResponse().get(params, requestOptions).thenApply { it.parse() }

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
    ): CompletableFuture<Property> =
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
    ): CompletableFuture<Property> =
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

        private val createHandler: Handler<MediaBridgeObject> =
            jsonHandler<MediaBridgeObject>(clientOptions.jsonMapper)

        override fun create(
            params: MediaBridgeCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaBridgeObject>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "objects")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val updateHandler: Handler<MediaBridgeObject> =
            jsonHandler<MediaBridgeObject>(clientOptions.jsonMapper)

        override fun update(
            params: MediaBridgeUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaBridgeObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "objects", params._pathParam(0))
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

        private val listHandler: Handler<CollectionResponseMediaBridgeObjectForwardPaging> =
            jsonHandler<CollectionResponseMediaBridgeObjectForwardPaging>(clientOptions.jsonMapper)

        override fun list(
            params: MediaBridgeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaBridgeListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("mediaType", params.mediaType().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "objects", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                MediaBridgeListPageAsync.builder()
                                    .service(MediaBridgeServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: MediaBridgeDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        "objects",
                        params._pathParam(0),
                        params._pathParam(1),
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

        override fun createAttentionSpanEvent(
            params: MediaBridgeCreateAttentionSpanEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "attention-span")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun createMediaPlayedEvent(
            params: MediaBridgeCreateMediaPlayedEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "media-played")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
        }

        override fun createMediaPlayedPercentEvent(
            params: MediaBridgeCreateMediaPlayedPercentEventParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("media-bridge", "2026-03", "events", "media-played-percent")
                    .putHeader("Accept", "*/*")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response -> errorHandler.handle(response) }
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

        private val createPropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun createProperty(
            params: MediaBridgeCreatePropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Property>> {
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

        private val getHandler: Handler<MediaBridgeObject> =
            jsonHandler<MediaBridgeObject>(clientOptions.jsonMapper)

        override fun get(
            params: MediaBridgeGetParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MediaBridgeObject>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("objectId", params.objectId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "media-bridge",
                        "2026-03",
                        "objects",
                        params._pathParam(0),
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
                            .use { getHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
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

        private val getPropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun getProperty(
            params: MediaBridgeGetPropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Property>> {
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

        private val updatePropertyHandler: Handler<Property> =
            jsonHandler<Property>(clientOptions.jsonMapper)

        override fun updateProperty(
            params: MediaBridgeUpdatePropertyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Property>> {
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
