// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListAllParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.FlagsForAppResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateResponse
import com.hubspot_sdk.api.services.async.crm.featureflags.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FeatureFlagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FeatureFlagServiceAsync

    fun batch(): BatchServiceAsync

    /** Specify an account-level flag state for a specific HubSpot account. */
    fun update(
        portalId: Int,
        params: FeatureFlagUpdateParams,
    ): CompletableFuture<PortalFlagStateResponse> = update(portalId, params, RequestOptions.none())

    /** @see update */
    fun update(
        portalId: Int,
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        update(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see update */
    fun update(params: FeatureFlagUpdateParams): CompletableFuture<PortalFlagStateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse>

    /**
     * Delete an account-level flag state for a specific HubSpot account. No request body is
     * included.
     */
    fun delete(
        portalId: Int,
        params: FeatureFlagDeleteParams,
    ): CompletableFuture<PortalFlagStateResponse> = delete(portalId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        portalId: Int,
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        delete(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see delete */
    fun delete(params: FeatureFlagDeleteParams): CompletableFuture<PortalFlagStateResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse>

    /** Retrieve the account-level flag state of a specific HubSpot account. */
    fun get(
        portalId: Int,
        params: FeatureFlagGetParams,
    ): CompletableFuture<PortalFlagStateResponse> = get(portalId, params, RequestOptions.none())

    /** @see get */
    fun get(
        portalId: Int,
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        get(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see get */
    fun get(params: FeatureFlagGetParams): CompletableFuture<PortalFlagStateResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse>

    fun listAll(appId: Int): CompletableFuture<FlagsForAppResponse> =
        listAll(appId, FeatureFlagListAllParams.none())

    /** @see listAll */
    fun listAll(
        appId: Int,
        params: FeatureFlagListAllParams = FeatureFlagListAllParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagsForAppResponse> =
        listAll(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listAll */
    fun listAll(
        appId: Int,
        params: FeatureFlagListAllParams = FeatureFlagListAllParams.none(),
    ): CompletableFuture<FlagsForAppResponse> = listAll(appId, params, RequestOptions.none())

    /** @see listAll */
    fun listAll(
        params: FeatureFlagListAllParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagsForAppResponse>

    /** @see listAll */
    fun listAll(params: FeatureFlagListAllParams): CompletableFuture<FlagsForAppResponse> =
        listAll(params, RequestOptions.none())

    /** @see listAll */
    fun listAll(
        appId: Int,
        requestOptions: RequestOptions,
    ): CompletableFuture<FlagsForAppResponse> =
        listAll(appId, FeatureFlagListAllParams.none(), requestOptions)

    /**
     * Retrieve a list of HubSpot accounts with an account-level flag setting for the specified app.
     * No request body is included.
     */
    fun listPortals(
        flagName: String,
        params: FeatureFlagListPortalsParams,
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        listPortals(flagName, params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        flagName: String,
        params: FeatureFlagListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see listPortals */
    fun listPortals(
        params: FeatureFlagListPortalsParams
    ): CompletableFuture<PortalFlagStateBatchResponse> = listPortals(params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        params: FeatureFlagListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse>

    /**
     * A view of [FeatureFlagServiceAsync] that provides access to raw HTTP responses for each
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
        ): FeatureFlagServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagServiceAsync.update].
         */
        fun update(
            portalId: Int,
            params: FeatureFlagUpdateParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            update(portalId, params, RequestOptions.none())

        /** @see update */
        fun update(
            portalId: Int,
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            update(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see update */
        fun update(
            params: FeatureFlagUpdateParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagServiceAsync.delete].
         */
        fun delete(
            portalId: Int,
            params: FeatureFlagDeleteParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            delete(portalId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            portalId: Int,
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            delete(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: FeatureFlagDeleteParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagServiceAsync.get].
         */
        fun get(
            portalId: Int,
            params: FeatureFlagGetParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            get(portalId, params, RequestOptions.none())

        /** @see get */
        fun get(
            portalId: Int,
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            get(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see get */
        fun get(
            params: FeatureFlagGetParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>>

        /**
         * Returns a raw HTTP response for `get /feature-flags/2026-03/{appId}/flags/all`, but is
         * otherwise the same as [FeatureFlagServiceAsync.listAll].
         */
        fun listAll(appId: Int): CompletableFuture<HttpResponseFor<FlagsForAppResponse>> =
            listAll(appId, FeatureFlagListAllParams.none())

        /** @see listAll */
        fun listAll(
            appId: Int,
            params: FeatureFlagListAllParams = FeatureFlagListAllParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagsForAppResponse>> =
            listAll(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listAll */
        fun listAll(
            appId: Int,
            params: FeatureFlagListAllParams = FeatureFlagListAllParams.none(),
        ): CompletableFuture<HttpResponseFor<FlagsForAppResponse>> =
            listAll(appId, params, RequestOptions.none())

        /** @see listAll */
        fun listAll(
            params: FeatureFlagListAllParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagsForAppResponse>>

        /** @see listAll */
        fun listAll(
            params: FeatureFlagListAllParams
        ): CompletableFuture<HttpResponseFor<FlagsForAppResponse>> =
            listAll(params, RequestOptions.none())

        /** @see listAll */
        fun listAll(
            appId: Int,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FlagsForAppResponse>> =
            listAll(appId, FeatureFlagListAllParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals`, but is otherwise the same as
         * [FeatureFlagServiceAsync.listPortals].
         */
        fun listPortals(
            flagName: String,
            params: FeatureFlagListPortalsParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            listPortals(flagName, params, RequestOptions.none())

        /** @see listPortals */
        fun listPortals(
            flagName: String,
            params: FeatureFlagListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see listPortals */
        fun listPortals(
            params: FeatureFlagListPortalsParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            listPortals(params, RequestOptions.none())

        /** @see listPortals */
        fun listPortals(
            params: FeatureFlagListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>>
    }
}
