// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm.featureflags

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.FlagResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppGetParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AppServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppServiceAsync

    /**
     * Set a feature flag for an app. For example, update the `hs-hide-crm-cards` flag's
     * `defaultState` to `ON` to hide classic CRM cards from new installs.
     */
    fun update(flagName: String, params: AppUpdateParams): CompletableFuture<FlagResponse> =
        update(flagName, params, RequestOptions.none())

    /** @see update */
    fun update(
        flagName: String,
        params: AppUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse> =
        update(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see update */
    fun update(params: AppUpdateParams): CompletableFuture<FlagResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AppUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse>

    /**
     * Delete a feature flag in an app. For example, delete the `hs-release-app-cards` flag after
     * all accounts have been migrated.
     */
    fun delete(flagName: String, params: AppDeleteParams): CompletableFuture<FlagResponse> =
        delete(flagName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        flagName: String,
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse> =
        delete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see delete */
    fun delete(params: AppDeleteParams): CompletableFuture<FlagResponse> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse>

    /** Retrieve the current status of the app's feature flags. No request body is included. */
    fun get(flagName: String, params: AppGetParams): CompletableFuture<FlagResponse> =
        get(flagName, params, RequestOptions.none())

    /** @see get */
    fun get(
        flagName: String,
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse> =
        get(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see get */
    fun get(params: AppGetParams): CompletableFuture<FlagResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FlagResponse>

    /**
     * Retrieve a list of HubSpot accounts with an account-level flag setting for the specified app.
     * No request body is included.
     */
    fun listPortals(
        flagName: String,
        params: AppListPortalsParams,
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        listPortals(flagName, params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        flagName: String,
        params: AppListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse> =
        listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see listPortals */
    fun listPortals(params: AppListPortalsParams): CompletableFuture<PortalFlagStateBatchResponse> =
        listPortals(params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        params: AppListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PortalFlagStateBatchResponse>

    /** A view of [AppServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /feature-flags/v3/{appId}/flags/{flagName}`, but is
         * otherwise the same as [AppServiceAsync.update].
         */
        fun update(
            flagName: String,
            params: AppUpdateParams,
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            update(flagName, params, RequestOptions.none())

        /** @see update */
        fun update(
            flagName: String,
            params: AppUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            update(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see update */
        fun update(params: AppUpdateParams): CompletableFuture<HttpResponseFor<FlagResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AppUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>>

        /**
         * Returns a raw HTTP response for `delete /feature-flags/v3/{appId}/flags/{flagName}`, but
         * is otherwise the same as [AppServiceAsync.delete].
         */
        fun delete(
            flagName: String,
            params: AppDeleteParams,
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            delete(flagName, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            flagName: String,
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            delete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see delete */
        fun delete(params: AppDeleteParams): CompletableFuture<HttpResponseFor<FlagResponse>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>>

        /**
         * Returns a raw HTTP response for `get /feature-flags/v3/{appId}/flags/{flagName}`, but is
         * otherwise the same as [AppServiceAsync.get].
         */
        fun get(
            flagName: String,
            params: AppGetParams,
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            get(flagName, params, RequestOptions.none())

        /** @see get */
        fun get(
            flagName: String,
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>> =
            get(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see get */
        fun get(params: AppGetParams): CompletableFuture<HttpResponseFor<FlagResponse>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FlagResponse>>

        /**
         * Returns a raw HTTP response for `get /feature-flags/v3/{appId}/flags/{flagName}/portals`,
         * but is otherwise the same as [AppServiceAsync.listPortals].
         */
        fun listPortals(
            flagName: String,
            params: AppListPortalsParams,
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            listPortals(flagName, params, RequestOptions.none())

        /** @see listPortals */
        fun listPortals(
            flagName: String,
            params: AppListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see listPortals */
        fun listPortals(
            params: AppListPortalsParams
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>> =
            listPortals(params, RequestOptions.none())

        /** @see listPortals */
        fun listPortals(
            params: AppListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PortalFlagStateBatchResponse>>
    }
}
