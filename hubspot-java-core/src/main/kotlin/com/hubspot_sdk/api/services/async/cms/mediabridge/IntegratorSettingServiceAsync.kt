// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.mediabridge

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.mediabridge.BulkIntegratorObjectCreationResponse
import com.hubspot_sdk.api.models.cms.mediabridge.EventVisibilityChange
import com.hubspot_sdk.api.models.cms.mediabridge.EventVisibilityResponse
import com.hubspot_sdk.api.models.cms.mediabridge.IntegratorOEmbedDomainModel
import com.hubspot_sdk.api.models.cms.mediabridge.MediaBridgeProviderRegistrationResponse
import com.hubspot_sdk.api.models.cms.mediabridge.OEmbedDomainsCollectionResponse
import com.hubspot_sdk.api.models.cms.mediabridge.ObjectDefinitionResponse
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateObjectDefinitionParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingCreateOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingDeleteOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetObjectDefinitionsByMediaTypeParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingGetOembedDomainParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingListOembedDomainsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingRegisterAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateAppNameParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateEventVisibilitySettingsParams
import com.hubspot_sdk.api.models.cms.mediabridge.integratorsettings.IntegratorSettingUpdateOembedDomainParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface IntegratorSettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntegratorSettingServiceAsync

    /** Create a new media object type */
    fun createObjectDefinition(
        appId: Int,
        params: IntegratorSettingCreateObjectDefinitionParams,
    ): CompletableFuture<BulkIntegratorObjectCreationResponse> =
        createObjectDefinition(appId, params, RequestOptions.none())

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        appId: Int,
        params: IntegratorSettingCreateObjectDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkIntegratorObjectCreationResponse> =
        createObjectDefinition(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        params: IntegratorSettingCreateObjectDefinitionParams
    ): CompletableFuture<BulkIntegratorObjectCreationResponse> =
        createObjectDefinition(params, RequestOptions.none())

    /** @see createObjectDefinition */
    fun createObjectDefinition(
        params: IntegratorSettingCreateObjectDefinitionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BulkIntegratorObjectCreationResponse>

    /** Set up a new oEmbed domain for your media bridge app. */
    fun createOembedDomain(
        appId: Int,
        params: IntegratorSettingCreateOembedDomainParams,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        createOembedDomain(appId, params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        appId: Int,
        params: IntegratorSettingCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: IntegratorSettingCreateOembedDomainParams
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        createOembedDomain(params, RequestOptions.none())

    /** @see createOembedDomain */
    fun createOembedDomain(
        params: IntegratorSettingCreateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel>

    /** Delete an existing oEmbed domain. */
    fun deleteOembedDomain(appId: Int): CompletableFuture<Void?> =
        deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: Int,
        params: IntegratorSettingDeleteOembedDomainParams =
            IntegratorSettingDeleteOembedDomainParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        appId: Int,
        params: IntegratorSettingDeleteOembedDomainParams =
            IntegratorSettingDeleteOembedDomainParams.none(),
    ): CompletableFuture<Void?> = deleteOembedDomain(appId, params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        params: IntegratorSettingDeleteOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(
        params: IntegratorSettingDeleteOembedDomainParams
    ): CompletableFuture<Void?> = deleteOembedDomain(params, RequestOptions.none())

    /** @see deleteOembedDomain */
    fun deleteOembedDomain(appId: Int, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none(), requestOptions)

    /** Get the visibility settings for media bridge events for your apps. */
    fun getEventVisibilitySettings(appId: Int): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(appId, IntegratorSettingGetEventVisibilitySettingsParams.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        params: IntegratorSettingGetEventVisibilitySettingsParams =
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        params: IntegratorSettingGetEventVisibilitySettingsParams =
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
    ): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: IntegratorSettingGetEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventVisibilityResponse>

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        params: IntegratorSettingGetEventVisibilitySettingsParams
    ): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(params, RequestOptions.none())

    /** @see getEventVisibilitySettings */
    fun getEventVisibilitySettings(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<EventVisibilityResponse> =
        getEventVisibilitySettings(
            appId,
            IntegratorSettingGetEventVisibilitySettingsParams.none(),
            requestOptions,
        )

    /** Get the existing objects types that belong to the specified media type. */
    fun getObjectDefinitionsByMediaType(
        mediaType: IntegratorSettingGetObjectDefinitionsByMediaTypeParams.MediaType,
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
    ): CompletableFuture<ObjectDefinitionResponse> =
        getObjectDefinitionsByMediaType(mediaType, params, RequestOptions.none())

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        mediaType: IntegratorSettingGetObjectDefinitionsByMediaTypeParams.MediaType,
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectDefinitionResponse> =
        getObjectDefinitionsByMediaType(
            params.toBuilder().mediaType(mediaType).build(),
            requestOptions,
        )

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams
    ): CompletableFuture<ObjectDefinitionResponse> =
        getObjectDefinitionsByMediaType(params, RequestOptions.none())

    /** @see getObjectDefinitionsByMediaType */
    fun getObjectDefinitionsByMediaType(
        params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ObjectDefinitionResponse>

    /** Get the details for an existing oEmbed domain. */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingGetOembedDomainParams,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        getOembedDomain(params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(), requestOptions)

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: IntegratorSettingGetOembedDomainParams
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        getOembedDomain(params, RequestOptions.none())

    /** @see getOembedDomain */
    fun getOembedDomain(
        params: IntegratorSettingGetOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel>

    /** Get the details for existing oEmbed domains for your app */
    fun listOembedDomains(appId: Int): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        params: IntegratorSettingListOembedDomainsParams =
            IntegratorSettingListOembedDomainsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        params: IntegratorSettingListOembedDomainsParams =
            IntegratorSettingListOembedDomainsParams.none(),
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(appId, params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: IntegratorSettingListOembedDomainsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OEmbedDomainsCollectionResponse>

    /** @see listOembedDomains */
    fun listOembedDomains(
        params: IntegratorSettingListOembedDomainsParams
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(params, RequestOptions.none())

    /** @see listOembedDomains */
    fun listOembedDomains(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<OEmbedDomainsCollectionResponse> =
        listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none(), requestOptions)

    /** Register the name that your app will display when a user is selecting media bridge items. */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: Int,
        params: IntegratorSettingRegisterAppNameParams,
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        registerAppName(appId, params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        appId: Int,
        params: IntegratorSettingRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: IntegratorSettingRegisterAppNameParams
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        registerAppName(params, RequestOptions.none())

    /** @see registerAppName */
    @Deprecated("deprecated")
    fun registerAppName(
        params: IntegratorSettingRegisterAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse>

    /** Update the name that your app will display when a user is selecting media bridge items. */
    fun updateAppName(
        appId: Int,
        params: IntegratorSettingUpdateAppNameParams,
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        updateAppName(appId, params, RequestOptions.none())

    /** @see updateAppName */
    fun updateAppName(
        appId: Int,
        params: IntegratorSettingUpdateAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        updateAppName(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateAppName */
    fun updateAppName(
        params: IntegratorSettingUpdateAppNameParams
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse> =
        updateAppName(params, RequestOptions.none())

    /** @see updateAppName */
    fun updateAppName(
        params: IntegratorSettingUpdateAppNameParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MediaBridgeProviderRegistrationResponse>

    /** Set the visibility settings for media bridge events created by your app. */
    fun updateEventVisibilitySettings(
        appId: Int,
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
    ): CompletableFuture<EventVisibilityChange> =
        updateEventVisibilitySettings(appId, params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        appId: Int,
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventVisibilityChange> =
        updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: IntegratorSettingUpdateEventVisibilitySettingsParams
    ): CompletableFuture<EventVisibilityChange> =
        updateEventVisibilitySettings(params, RequestOptions.none())

    /** @see updateEventVisibilitySettings */
    fun updateEventVisibilitySettings(
        params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EventVisibilityChange>

    /** Update an existing oEmbed domain. */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingUpdateOembedDomainParams,
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        oEmbedDomainId: String,
        params: IntegratorSettingUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        updateOembedDomain(
            params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
            requestOptions,
        )

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: IntegratorSettingUpdateOembedDomainParams
    ): CompletableFuture<IntegratorOEmbedDomainModel> =
        updateOembedDomain(params, RequestOptions.none())

    /** @see updateOembedDomain */
    fun updateOembedDomain(
        params: IntegratorSettingUpdateOembedDomainParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntegratorOEmbedDomainModel>

    /**
     * A view of [IntegratorSettingServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntegratorSettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /media-bridge/v1/{appId}/settings/object-definitions`, but is otherwise the same as
         * [IntegratorSettingServiceAsync.createObjectDefinition].
         */
        fun createObjectDefinition(
            appId: Int,
            params: IntegratorSettingCreateObjectDefinitionParams,
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>> =
            createObjectDefinition(appId, params, RequestOptions.none())

        /** @see createObjectDefinition */
        fun createObjectDefinition(
            appId: Int,
            params: IntegratorSettingCreateObjectDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>> =
            createObjectDefinition(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createObjectDefinition */
        fun createObjectDefinition(
            params: IntegratorSettingCreateObjectDefinitionParams
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>> =
            createObjectDefinition(params, RequestOptions.none())

        /** @see createObjectDefinition */
        fun createObjectDefinition(
            params: IntegratorSettingCreateObjectDefinitionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BulkIntegratorObjectCreationResponse>>

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/{appId}/settings/oembed-domains`,
         * but is otherwise the same as [IntegratorSettingServiceAsync.createOembedDomain].
         */
        fun createOembedDomain(
            appId: Int,
            params: IntegratorSettingCreateOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            createOembedDomain(appId, params, RequestOptions.none())

        /** @see createOembedDomain */
        fun createOembedDomain(
            appId: Int,
            params: IntegratorSettingCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            createOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createOembedDomain */
        fun createOembedDomain(
            params: IntegratorSettingCreateOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            createOembedDomain(params, RequestOptions.none())

        /** @see createOembedDomain */
        fun createOembedDomain(
            params: IntegratorSettingCreateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>>

        /**
         * Returns a raw HTTP response for `delete
         * /media-bridge/v1/{appId}/settings/oembed-domains`, but is otherwise the same as
         * [IntegratorSettingServiceAsync.deleteOembedDomain].
         */
        fun deleteOembedDomain(appId: Int): CompletableFuture<HttpResponse> =
            deleteOembedDomain(appId, IntegratorSettingDeleteOembedDomainParams.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: Int,
            params: IntegratorSettingDeleteOembedDomainParams =
                IntegratorSettingDeleteOembedDomainParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: Int,
            params: IntegratorSettingDeleteOembedDomainParams =
                IntegratorSettingDeleteOembedDomainParams.none(),
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(appId, params, RequestOptions.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            params: IntegratorSettingDeleteOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            params: IntegratorSettingDeleteOembedDomainParams
        ): CompletableFuture<HttpResponse> = deleteOembedDomain(params, RequestOptions.none())

        /** @see deleteOembedDomain */
        fun deleteOembedDomain(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteOembedDomain(
                appId,
                IntegratorSettingDeleteOembedDomainParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/settings/event-visibility`,
         * but is otherwise the same as [IntegratorSettingServiceAsync.getEventVisibilitySettings].
         */
        fun getEventVisibilitySettings(
            appId: Int
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(
                appId,
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
            )

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: Int,
            params: IntegratorSettingGetEventVisibilitySettingsParams =
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: Int,
            params: IntegratorSettingGetEventVisibilitySettingsParams =
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            params: IntegratorSettingGetEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>>

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            params: IntegratorSettingGetEventVisibilitySettingsParams
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(params, RequestOptions.none())

        /** @see getEventVisibilitySettings */
        fun getEventVisibilitySettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EventVisibilityResponse>> =
            getEventVisibilitySettings(
                appId,
                IntegratorSettingGetEventVisibilitySettingsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/settings/object-definitions/{mediaType}`, but is otherwise the
         * same as [IntegratorSettingServiceAsync.getObjectDefinitionsByMediaType].
         */
        fun getObjectDefinitionsByMediaType(
            mediaType: IntegratorSettingGetObjectDefinitionsByMediaTypeParams.MediaType,
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>> =
            getObjectDefinitionsByMediaType(mediaType, params, RequestOptions.none())

        /** @see getObjectDefinitionsByMediaType */
        fun getObjectDefinitionsByMediaType(
            mediaType: IntegratorSettingGetObjectDefinitionsByMediaTypeParams.MediaType,
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>> =
            getObjectDefinitionsByMediaType(
                params.toBuilder().mediaType(mediaType).build(),
                requestOptions,
            )

        /** @see getObjectDefinitionsByMediaType */
        fun getObjectDefinitionsByMediaType(
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>> =
            getObjectDefinitionsByMediaType(params, RequestOptions.none())

        /** @see getObjectDefinitionsByMediaType */
        fun getObjectDefinitionsByMediaType(
            params: IntegratorSettingGetObjectDefinitionsByMediaTypeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ObjectDefinitionResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise the
         * same as [IntegratorSettingServiceAsync.getOembedDomain].
         */
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingGetOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            getOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see getOembedDomain */
        fun getOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            getOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see getOembedDomain */
        fun getOembedDomain(
            params: IntegratorSettingGetOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            getOembedDomain(params, RequestOptions.none())

        /** @see getOembedDomain */
        fun getOembedDomain(
            params: IntegratorSettingGetOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>>

        /**
         * Returns a raw HTTP response for `get /media-bridge/v1/{appId}/settings/oembed-domains`,
         * but is otherwise the same as [IntegratorSettingServiceAsync.listOembedDomains].
         */
        fun listOembedDomains(
            appId: Int
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(appId, IntegratorSettingListOembedDomainsParams.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: Int,
            params: IntegratorSettingListOembedDomainsParams =
                IntegratorSettingListOembedDomainsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: Int,
            params: IntegratorSettingListOembedDomainsParams =
                IntegratorSettingListOembedDomainsParams.none(),
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(appId, params, RequestOptions.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            params: IntegratorSettingListOembedDomainsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>>

        /** @see listOembedDomains */
        fun listOembedDomains(
            params: IntegratorSettingListOembedDomainsParams
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(params, RequestOptions.none())

        /** @see listOembedDomains */
        fun listOembedDomains(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OEmbedDomainsCollectionResponse>> =
            listOembedDomains(
                appId,
                IntegratorSettingListOembedDomainsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /media-bridge/v1/{appId}/settings/register`, but is
         * otherwise the same as [IntegratorSettingServiceAsync.registerAppName].
         */
        @Deprecated("deprecated")
        fun registerAppName(
            appId: Int,
            params: IntegratorSettingRegisterAppNameParams,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            registerAppName(appId, params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            appId: Int,
            params: IntegratorSettingRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            registerAppName(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            params: IntegratorSettingRegisterAppNameParams
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            registerAppName(params, RequestOptions.none())

        /** @see registerAppName */
        @Deprecated("deprecated")
        fun registerAppName(
            params: IntegratorSettingRegisterAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>>

        /**
         * Returns a raw HTTP response for `put /media-bridge/v1/{appId}/settings`, but is otherwise
         * the same as [IntegratorSettingServiceAsync.updateAppName].
         */
        fun updateAppName(
            appId: Int,
            params: IntegratorSettingUpdateAppNameParams,
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            updateAppName(appId, params, RequestOptions.none())

        /** @see updateAppName */
        fun updateAppName(
            appId: Int,
            params: IntegratorSettingUpdateAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            updateAppName(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateAppName */
        fun updateAppName(
            params: IntegratorSettingUpdateAppNameParams
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>> =
            updateAppName(params, RequestOptions.none())

        /** @see updateAppName */
        fun updateAppName(
            params: IntegratorSettingUpdateAppNameParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MediaBridgeProviderRegistrationResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/settings/event-visibility`, but is otherwise the same as
         * [IntegratorSettingServiceAsync.updateEventVisibilitySettings].
         */
        fun updateEventVisibilitySettings(
            appId: Int,
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>> =
            updateEventVisibilitySettings(appId, params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            appId: Int,
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>> =
            updateEventVisibilitySettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            params: IntegratorSettingUpdateEventVisibilitySettingsParams
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>> =
            updateEventVisibilitySettings(params, RequestOptions.none())

        /** @see updateEventVisibilitySettings */
        fun updateEventVisibilitySettings(
            params: IntegratorSettingUpdateEventVisibilitySettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EventVisibilityChange>>

        /**
         * Returns a raw HTTP response for `patch
         * /media-bridge/v1/{appId}/settings/oembed-domains/{oEmbedDomainId}`, but is otherwise the
         * same as [IntegratorSettingServiceAsync.updateOembedDomain].
         */
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingUpdateOembedDomainParams,
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            updateOembedDomain(oEmbedDomainId, params, RequestOptions.none())

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            oEmbedDomainId: String,
            params: IntegratorSettingUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            updateOembedDomain(
                params.toBuilder().oEmbedDomainId(oEmbedDomainId).build(),
                requestOptions,
            )

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            params: IntegratorSettingUpdateOembedDomainParams
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>> =
            updateOembedDomain(params, RequestOptions.none())

        /** @see updateOembedDomain */
        fun updateOembedDomain(
            params: IntegratorSettingUpdateOembedDomainParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntegratorOEmbedDomainModel>>
    }
}
