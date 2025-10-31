// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.crm

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.crm.appuninstalls.AppUninstallUninstallParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AppUninstallServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppUninstallServiceAsync

    /**
     * Use this endpoint to uninstall your app from a customer's HubSpot account. If successful,
     * this endpoint will return a 204 and the customer will receive an email notification that the
     * developer has uninstall the app from their account.
     */
    fun uninstall(): CompletableFuture<Void?> = uninstall(AppUninstallUninstallParams.none())

    /** @see uninstall */
    fun uninstall(
        params: AppUninstallUninstallParams = AppUninstallUninstallParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see uninstall */
    fun uninstall(
        params: AppUninstallUninstallParams = AppUninstallUninstallParams.none()
    ): CompletableFuture<Void?> = uninstall(params, RequestOptions.none())

    /** @see uninstall */
    fun uninstall(requestOptions: RequestOptions): CompletableFuture<Void?> =
        uninstall(AppUninstallUninstallParams.none(), requestOptions)

    /**
     * A view of [AppUninstallServiceAsync] that provides access to raw HTTP responses for each
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
        ): AppUninstallServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /appinstalls/v3/external-install`, but is
         * otherwise the same as [AppUninstallServiceAsync.uninstall].
         */
        fun uninstall(): CompletableFuture<HttpResponse> =
            uninstall(AppUninstallUninstallParams.none())

        /** @see uninstall */
        fun uninstall(
            params: AppUninstallUninstallParams = AppUninstallUninstallParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see uninstall */
        fun uninstall(
            params: AppUninstallUninstallParams = AppUninstallUninstallParams.none()
        ): CompletableFuture<HttpResponse> = uninstall(params, RequestOptions.none())

        /** @see uninstall */
        fun uninstall(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            uninstall(AppUninstallUninstallParams.none(), requestOptions)
    }
}
