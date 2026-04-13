// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.blocking.crm

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.crm.appuninstalls.AppUninstallUninstallParams
import java.util.function.Consumer

interface AppUninstallService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppUninstallService

    /**
     * Use this endpoint to uninstall your app from a customer's HubSpot account. If successful,
     * this endpoint will return a 204 and the customer will receive an email notification that the
     * developer has uninstall the app from their account.
     */
    fun uninstall() = uninstall(AppUninstallUninstallParams.none())

    /** @see uninstall */
    fun uninstall(
        params: AppUninstallUninstallParams = AppUninstallUninstallParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see uninstall */
    fun uninstall(params: AppUninstallUninstallParams = AppUninstallUninstallParams.none()) =
        uninstall(params, RequestOptions.none())

    /** @see uninstall */
    fun uninstall(requestOptions: RequestOptions) =
        uninstall(AppUninstallUninstallParams.none(), requestOptions)

    /**
     * A view of [AppUninstallService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppUninstallService.WithRawResponse

        /**
         * Returns a raw HTTP response for `delete /appinstalls/2026-03/external-install`, but is
         * otherwise the same as [AppUninstallService.uninstall].
         */
        @MustBeClosed fun uninstall(): HttpResponse = uninstall(AppUninstallUninstallParams.none())

        /** @see uninstall */
        @MustBeClosed
        fun uninstall(
            params: AppUninstallUninstallParams = AppUninstallUninstallParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see uninstall */
        @MustBeClosed
        fun uninstall(
            params: AppUninstallUninstallParams = AppUninstallUninstallParams.none()
        ): HttpResponse = uninstall(params, RequestOptions.none())

        /** @see uninstall */
        @MustBeClosed
        fun uninstall(requestOptions: RequestOptions): HttpResponse =
            uninstall(AppUninstallUninstallParams.none(), requestOptions)
    }
}
