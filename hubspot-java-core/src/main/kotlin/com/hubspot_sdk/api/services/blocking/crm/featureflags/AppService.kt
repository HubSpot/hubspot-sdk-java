// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.crm.featureflags

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.crm.featureflags.FlagResponse
import com.hubspot_sdk.api.models.crm.featureflags.PortalFlagStateBatchResponse
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppDeleteParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppGetParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppListPortalsParams
import com.hubspot_sdk.api.models.crm.featureflags.apps.AppUpdateParams
import java.util.function.Consumer

interface AppService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppService

    /**
     * Set a feature flag for an app. For example, update the `hs-hide-crm-cards` flag's
     * `defaultState` to `ON` to hide classic CRM cards from new installs.
     */
    fun update(flagName: String, params: AppUpdateParams): FlagResponse =
        update(flagName, params, RequestOptions.none())

    /** @see update */
    fun update(
        flagName: String,
        params: AppUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse = update(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see update */
    fun update(params: AppUpdateParams): FlagResponse = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AppUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse

    /**
     * Delete a feature flag in an app. For example, delete the `hs-release-app-cards` flag after
     * all accounts have been migrated.
     */
    fun delete(flagName: String, params: AppDeleteParams): FlagResponse =
        delete(flagName, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        flagName: String,
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse = delete(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see delete */
    fun delete(params: AppDeleteParams): FlagResponse = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AppDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse

    /** Retrieve the current status of the app's feature flags. No request body is included. */
    fun get(flagName: String, params: AppGetParams): FlagResponse =
        get(flagName, params, RequestOptions.none())

    /** @see get */
    fun get(
        flagName: String,
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse = get(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see get */
    fun get(params: AppGetParams): FlagResponse = get(params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AppGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FlagResponse

    /**
     * Retrieve a list of HubSpot accounts with an account-level flag setting for the specified app.
     * No request body is included.
     */
    fun listPortals(flagName: String, params: AppListPortalsParams): PortalFlagStateBatchResponse =
        listPortals(flagName, params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        flagName: String,
        params: AppListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateBatchResponse =
        listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

    /** @see listPortals */
    fun listPortals(params: AppListPortalsParams): PortalFlagStateBatchResponse =
        listPortals(params, RequestOptions.none())

    /** @see listPortals */
    fun listPortals(
        params: AppListPortalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PortalFlagStateBatchResponse

    /** A view of [AppService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /feature-flags/v3/{appId}/flags/{flagName}`, but is
         * otherwise the same as [AppService.update].
         */
        @MustBeClosed
        fun update(flagName: String, params: AppUpdateParams): HttpResponseFor<FlagResponse> =
            update(flagName, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            flagName: String,
            params: AppUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse> =
            update(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AppUpdateParams): HttpResponseFor<FlagResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AppUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse>

        /**
         * Returns a raw HTTP response for `delete /feature-flags/v3/{appId}/flags/{flagName}`, but
         * is otherwise the same as [AppService.delete].
         */
        @MustBeClosed
        fun delete(flagName: String, params: AppDeleteParams): HttpResponseFor<FlagResponse> =
            delete(flagName, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            flagName: String,
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse> =
            delete(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AppDeleteParams): HttpResponseFor<FlagResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AppDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse>

        /**
         * Returns a raw HTTP response for `get /feature-flags/v3/{appId}/flags/{flagName}`, but is
         * otherwise the same as [AppService.get].
         */
        @MustBeClosed
        fun get(flagName: String, params: AppGetParams): HttpResponseFor<FlagResponse> =
            get(flagName, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            flagName: String,
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse> =
            get(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(params: AppGetParams): HttpResponseFor<FlagResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: AppGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FlagResponse>

        /**
         * Returns a raw HTTP response for `get /feature-flags/v3/{appId}/flags/{flagName}/portals`,
         * but is otherwise the same as [AppService.listPortals].
         */
        @MustBeClosed
        fun listPortals(
            flagName: String,
            params: AppListPortalsParams,
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            listPortals(flagName, params, RequestOptions.none())

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(
            flagName: String,
            params: AppListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            listPortals(params.toBuilder().flagName(flagName).build(), requestOptions)

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(
            params: AppListPortalsParams
        ): HttpResponseFor<PortalFlagStateBatchResponse> =
            listPortals(params, RequestOptions.none())

        /** @see listPortals */
        @MustBeClosed
        fun listPortals(
            params: AppListPortalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PortalFlagStateBatchResponse>
    }
}
