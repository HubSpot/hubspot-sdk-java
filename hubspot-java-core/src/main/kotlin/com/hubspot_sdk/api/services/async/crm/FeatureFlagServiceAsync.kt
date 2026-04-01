// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagDeletePortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagGetPortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListAllParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdateParams
import com.hubspot_sdk.api.models.crm.featureflags.FeatureFlagUpdatePortalStateParams
import com.hubspot_sdk.api.models.crm.featureflags.FlagResponse
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

    /**
     * Set a feature flag for an app. For example, update the `hs-hide-crm-cards` flag's
     * `defaultState` to `ON` to hide classic CRM cards from new installs.
     */
    fun update(flagName: String, params: FeatureFlagUpdateParams): CompletableFuture<FlagResponse> =
        update(flagName, params, RequestOptions.none())

    /** @see update */
    fun update(
        flagName: String,
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse> =
        update(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see update */
    fun update(params: FeatureFlagUpdateParams): CompletableFuture<FlagResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FeatureFlagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse>

    /**
     * Delete a feature flag in an app. For example, delete the `hs-release-app-cards` flag after
     * all accounts have been migrated.
     */
    fun delete(flagName: String, params: FeatureFlagDeleteParams): CompletableFuture<FlagResponse> =
        delete(flagName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        flagName: String,
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse> =
        delete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see delete */
    fun delete(params: FeatureFlagDeleteParams): CompletableFuture<FlagResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: FeatureFlagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse>

    /**
     * Delete an account-level flag state for a specific HubSpot account. No request body is
     * included.
     */
    fun deletePortalState(
        portalId: Int,
        params: FeatureFlagDeletePortalStateParams,
    ): CompletableFuture<PortalFlagStateResponse> =
        deletePortalState(portalId, params, RequestOptions.none())

    /** @see deletePortalState */
    fun deletePortalState(
        portalId: Int,
        params: FeatureFlagDeletePortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        deletePortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see deletePortalState */
    fun deletePortalState(
        params: FeatureFlagDeletePortalStateParams
    ): CompletableFuture<PortalFlagStateResponse> = deletePortalState(params, RequestOptions.none())

    /** @see deletePortalState */
    fun deletePortalState(
        params: FeatureFlagDeletePortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse>

    /** Retrieve the current status of the app's feature flags. No request body is included. */
    fun get(flagName: String, params: FeatureFlagGetParams): CompletableFuture<FlagResponse> =
        get(flagName, params, RequestOptions.none())

    /** @see get */
    fun get(
        flagName: String,
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse> =
        get(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see get */
    fun get(params: FeatureFlagGetParams): CompletableFuture<FlagResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: FeatureFlagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse>

    /** Retrieve the account-level flag state of a specific HubSpot account. */
    fun getPortalState(
        portalId: Int,
        params: FeatureFlagGetPortalStateParams,
    ): CompletableFuture<PortalFlagStateResponse> =
        getPortalState(portalId, params, RequestOptions.none())

    /** @see getPortalState */
    fun getPortalState(
        portalId: Int,
        params: FeatureFlagGetPortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        getPortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see getPortalState */
    fun getPortalState(
        params: FeatureFlagGetPortalStateParams
    ): CompletableFuture<PortalFlagStateResponse> = getPortalState(params, RequestOptions.none())

    /** @see getPortalState */
    fun getPortalState(
        params: FeatureFlagGetPortalStateParams,
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

    /** Specify an account-level flag state for a specific HubSpot account. */
    fun updatePortalState(
        portalId: Int,
        params: FeatureFlagUpdatePortalStateParams,
    ): CompletableFuture<PortalFlagStateResponse> =
        updatePortalState(portalId, params, RequestOptions.none())

    /** @see updatePortalState */
    fun updatePortalState(
        portalId: Int,
        params: FeatureFlagUpdatePortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse> =
        updatePortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

    /** @see updatePortalState */
    fun updatePortalState(
        params: FeatureFlagUpdatePortalStateParams
    ): CompletableFuture<PortalFlagStateResponse> = updatePortalState(params, RequestOptions.none())

    /** @see updatePortalState */
    fun updatePortalState(
        params: FeatureFlagUpdatePortalStateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateResponse>

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
         * Returns a raw HTTP response for `put /feature-flags/2026-03/{appId}/flags/{flagName}`,
         * but is otherwise the same as [FeatureFlagServiceAsync.update].
         */
        fun update(
            flagName: String,
            params: FeatureFlagUpdateParams,
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            update(flagName, params, RequestOptions.none())

        /** @see update */
        fun update(
            flagName: String,
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            update(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see update */
        fun update(
            params: FeatureFlagUpdateParams
        ): CompletableFuture<HttpResponseFor<FlagResponse>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FeatureFlagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>>

        /**
         * Returns a raw HTTP response for `delete /feature-flags/2026-03/{appId}/flags/{flagName}`,
         * but is otherwise the same as [FeatureFlagServiceAsync.delete].
         */
        fun delete(
            flagName: String,
            params: FeatureFlagDeleteParams,
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            delete(flagName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            flagName: String,
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            delete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: FeatureFlagDeleteParams
        ): CompletableFuture<HttpResponseFor<FlagResponse>> = delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: FeatureFlagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagServiceAsync.deletePortalState].
         */
        fun deletePortalState(
            portalId: Int,
            params: FeatureFlagDeletePortalStateParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            deletePortalState(portalId, params, RequestOptions.none())

        /** @see deletePortalState */
        fun deletePortalState(
            portalId: Int,
            params: FeatureFlagDeletePortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            deletePortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see deletePortalState */
        fun deletePortalState(
            params: FeatureFlagDeletePortalStateParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            deletePortalState(params, RequestOptions.none())

        /** @see deletePortalState */
        fun deletePortalState(
            params: FeatureFlagDeletePortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>>

        /**
         * Returns a raw HTTP response for `get /feature-flags/2026-03/{appId}/flags/{flagName}`,
         * but is otherwise the same as [FeatureFlagServiceAsync.get].
         */
        fun get(
            flagName: String,
            params: FeatureFlagGetParams,
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            get(flagName, params, RequestOptions.none())

        /** @see get */
        fun get(
            flagName: String,
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            get(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see get */
        fun get(params: FeatureFlagGetParams): CompletableFuture<HttpResponseFor<FlagResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: FeatureFlagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>>

        /**
         * Returns a raw HTTP response for `get
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagServiceAsync.getPortalState].
         */
        fun getPortalState(
            portalId: Int,
            params: FeatureFlagGetPortalStateParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            getPortalState(portalId, params, RequestOptions.none())

        /** @see getPortalState */
        fun getPortalState(
            portalId: Int,
            params: FeatureFlagGetPortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            getPortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see getPortalState */
        fun getPortalState(
            params: FeatureFlagGetPortalStateParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            getPortalState(params, RequestOptions.none())

        /** @see getPortalState */
        fun getPortalState(
            params: FeatureFlagGetPortalStateParams,
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

        /**
         * Returns a raw HTTP response for `put
         * /feature-flags/2026-03/{appId}/flags/{flagName}/portals/{portalId}`, but is otherwise the
         * same as [FeatureFlagServiceAsync.updatePortalState].
         */
        fun updatePortalState(
            portalId: Int,
            params: FeatureFlagUpdatePortalStateParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            updatePortalState(portalId, params, RequestOptions.none())

        /** @see updatePortalState */
        fun updatePortalState(
            portalId: Int,
            params: FeatureFlagUpdatePortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            updatePortalState(params.toBuilder().portalId(portalId).build(), requestOptions)

        /** @see updatePortalState */
        fun updatePortalState(
            params: FeatureFlagUpdatePortalStateParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>> =
            updatePortalState(params, RequestOptions.none())

        /** @see updatePortalState */
        fun updatePortalState(
            params: FeatureFlagUpdatePortalStateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateResponse>>
    }
}
