// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookBatchUpdateSubscriptionsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookCreateSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookDeleteSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookDeleteSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookGetSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookGetSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookListSubscriptionsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookUpdateSettingsParams
import com.hubspot_sdk.api.models.appwebhooks.AppWebhookUpdateSubscriptionParams
import com.hubspot_sdk.api.models.appwebhooks.BatchResponseSubscriptionResponse
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionListResponse
import com.hubspot_sdk.api.models.appwebhooks.SubscriptionResponse
import com.hubspot_sdk.api.models.crm.extensions.calling.SettingsResponse
import java.util.function.Consumer

interface AppWebhookService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AppWebhookService

    fun batchUpdateSubscriptions(
        appId: Int,
        params: AppWebhookBatchUpdateSubscriptionsParams,
    ): BatchResponseSubscriptionResponse =
        batchUpdateSubscriptions(appId, params, RequestOptions.none())

    /** @see batchUpdateSubscriptions */
    fun batchUpdateSubscriptions(
        appId: Int,
        params: AppWebhookBatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse =
        batchUpdateSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see batchUpdateSubscriptions */
    fun batchUpdateSubscriptions(
        params: AppWebhookBatchUpdateSubscriptionsParams
    ): BatchResponseSubscriptionResponse = batchUpdateSubscriptions(params, RequestOptions.none())

    /** @see batchUpdateSubscriptions */
    fun batchUpdateSubscriptions(
        params: AppWebhookBatchUpdateSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseSubscriptionResponse

    fun createSubscription(
        appId: Int,
        params: AppWebhookCreateSubscriptionParams,
    ): SubscriptionResponse = createSubscription(appId, params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        appId: Int,
        params: AppWebhookCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see createSubscription */
    fun createSubscription(params: AppWebhookCreateSubscriptionParams): SubscriptionResponse =
        createSubscription(params, RequestOptions.none())

    /** @see createSubscription */
    fun createSubscription(
        params: AppWebhookCreateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    fun deleteSettings(appId: Int) = deleteSettings(appId, AppWebhookDeleteSettingsParams.none())

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: AppWebhookDeleteSettingsParams = AppWebhookDeleteSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see deleteSettings */
    fun deleteSettings(
        appId: Int,
        params: AppWebhookDeleteSettingsParams = AppWebhookDeleteSettingsParams.none(),
    ) = deleteSettings(appId, params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(
        params: AppWebhookDeleteSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteSettings */
    fun deleteSettings(params: AppWebhookDeleteSettingsParams) =
        deleteSettings(params, RequestOptions.none())

    /** @see deleteSettings */
    fun deleteSettings(appId: Int, requestOptions: RequestOptions) =
        deleteSettings(appId, AppWebhookDeleteSettingsParams.none(), requestOptions)

    fun deleteSubscription(subscriptionId: Int, params: AppWebhookDeleteSubscriptionParams) =
        deleteSubscription(subscriptionId, params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        subscriptionId: Int,
        params: AppWebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see deleteSubscription */
    fun deleteSubscription(params: AppWebhookDeleteSubscriptionParams) =
        deleteSubscription(params, RequestOptions.none())

    /** @see deleteSubscription */
    fun deleteSubscription(
        params: AppWebhookDeleteSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    fun getSettings(appId: Int): SettingsResponse =
        getSettings(appId, AppWebhookGetSettingsParams.none())

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: AppWebhookGetSettingsParams = AppWebhookGetSettingsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = getSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see getSettings */
    fun getSettings(
        appId: Int,
        params: AppWebhookGetSettingsParams = AppWebhookGetSettingsParams.none(),
    ): SettingsResponse = getSettings(appId, params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(
        params: AppWebhookGetSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    /** @see getSettings */
    fun getSettings(params: AppWebhookGetSettingsParams): SettingsResponse =
        getSettings(params, RequestOptions.none())

    /** @see getSettings */
    fun getSettings(appId: Int, requestOptions: RequestOptions): SettingsResponse =
        getSettings(appId, AppWebhookGetSettingsParams.none(), requestOptions)

    fun getSubscription(
        subscriptionId: Int,
        params: AppWebhookGetSubscriptionParams,
    ): SubscriptionResponse = getSubscription(subscriptionId, params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        subscriptionId: Int,
        params: AppWebhookGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        getSubscription(params.toBuilder().subscriptionId(subscriptionId).build(), requestOptions)

    /** @see getSubscription */
    fun getSubscription(params: AppWebhookGetSubscriptionParams): SubscriptionResponse =
        getSubscription(params, RequestOptions.none())

    /** @see getSubscription */
    fun getSubscription(
        params: AppWebhookGetSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    fun listSubscriptions(appId: Int): SubscriptionListResponse =
        listSubscriptions(appId, AppWebhookListSubscriptionsParams.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: AppWebhookListSubscriptionsParams = AppWebhookListSubscriptionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse =
        listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see listSubscriptions */
    fun listSubscriptions(
        appId: Int,
        params: AppWebhookListSubscriptionsParams = AppWebhookListSubscriptionsParams.none(),
    ): SubscriptionListResponse = listSubscriptions(appId, params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(
        params: AppWebhookListSubscriptionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionListResponse

    /** @see listSubscriptions */
    fun listSubscriptions(params: AppWebhookListSubscriptionsParams): SubscriptionListResponse =
        listSubscriptions(params, RequestOptions.none())

    /** @see listSubscriptions */
    fun listSubscriptions(appId: Int, requestOptions: RequestOptions): SubscriptionListResponse =
        listSubscriptions(appId, AppWebhookListSubscriptionsParams.none(), requestOptions)

    fun updateSettings(appId: Int, params: AppWebhookUpdateSettingsParams): SettingsResponse =
        updateSettings(appId, params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        appId: Int,
        params: AppWebhookUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse = updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

    /** @see updateSettings */
    fun updateSettings(params: AppWebhookUpdateSettingsParams): SettingsResponse =
        updateSettings(params, RequestOptions.none())

    /** @see updateSettings */
    fun updateSettings(
        params: AppWebhookUpdateSettingsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingsResponse

    fun updateSubscription(
        subscriptionId: Int,
        params: AppWebhookUpdateSubscriptionParams,
    ): SubscriptionResponse = updateSubscription(subscriptionId, params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        subscriptionId: Int,
        params: AppWebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse =
        updateSubscription(
            params.toBuilder().subscriptionId(subscriptionId).build(),
            requestOptions,
        )

    /** @see updateSubscription */
    fun updateSubscription(params: AppWebhookUpdateSubscriptionParams): SubscriptionResponse =
        updateSubscription(params, RequestOptions.none())

    /** @see updateSubscription */
    fun updateSubscription(
        params: AppWebhookUpdateSubscriptionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SubscriptionResponse

    /** A view of [AppWebhookService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AppWebhookService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /app-webhooks/2026-03/{appId}/subscriptions/batch/update`, but is otherwise the same as
         * [AppWebhookService.batchUpdateSubscriptions].
         */
        @MustBeClosed
        fun batchUpdateSubscriptions(
            appId: Int,
            params: AppWebhookBatchUpdateSubscriptionsParams,
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            batchUpdateSubscriptions(appId, params, RequestOptions.none())

        /** @see batchUpdateSubscriptions */
        @MustBeClosed
        fun batchUpdateSubscriptions(
            appId: Int,
            params: AppWebhookBatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            batchUpdateSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see batchUpdateSubscriptions */
        @MustBeClosed
        fun batchUpdateSubscriptions(
            params: AppWebhookBatchUpdateSubscriptionsParams
        ): HttpResponseFor<BatchResponseSubscriptionResponse> =
            batchUpdateSubscriptions(params, RequestOptions.none())

        /** @see batchUpdateSubscriptions */
        @MustBeClosed
        fun batchUpdateSubscriptions(
            params: AppWebhookBatchUpdateSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseSubscriptionResponse>

        /**
         * Returns a raw HTTP response for `post /app-webhooks/2026-03/{appId}/subscriptions`, but
         * is otherwise the same as [AppWebhookService.createSubscription].
         */
        @MustBeClosed
        fun createSubscription(
            appId: Int,
            params: AppWebhookCreateSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            createSubscription(appId, params, RequestOptions.none())

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            appId: Int,
            params: AppWebhookCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            createSubscription(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            params: AppWebhookCreateSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = createSubscription(params, RequestOptions.none())

        /** @see createSubscription */
        @MustBeClosed
        fun createSubscription(
            params: AppWebhookCreateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `delete /app-webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [AppWebhookService.deleteSettings].
         */
        @MustBeClosed
        fun deleteSettings(appId: Int): HttpResponse =
            deleteSettings(appId, AppWebhookDeleteSettingsParams.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            appId: Int,
            params: AppWebhookDeleteSettingsParams = AppWebhookDeleteSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = deleteSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            appId: Int,
            params: AppWebhookDeleteSettingsParams = AppWebhookDeleteSettingsParams.none(),
        ): HttpResponse = deleteSettings(appId, params, RequestOptions.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(
            params: AppWebhookDeleteSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(params: AppWebhookDeleteSettingsParams): HttpResponse =
            deleteSettings(params, RequestOptions.none())

        /** @see deleteSettings */
        @MustBeClosed
        fun deleteSettings(appId: Int, requestOptions: RequestOptions): HttpResponse =
            deleteSettings(appId, AppWebhookDeleteSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete
         * /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same
         * as [AppWebhookService.deleteSubscription].
         */
        @MustBeClosed
        fun deleteSubscription(
            subscriptionId: Int,
            params: AppWebhookDeleteSubscriptionParams,
        ): HttpResponse = deleteSubscription(subscriptionId, params, RequestOptions.none())

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(
            subscriptionId: Int,
            params: AppWebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(params: AppWebhookDeleteSubscriptionParams): HttpResponse =
            deleteSubscription(params, RequestOptions.none())

        /** @see deleteSubscription */
        @MustBeClosed
        fun deleteSubscription(
            params: AppWebhookDeleteSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /app-webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [AppWebhookService.getSettings].
         */
        @MustBeClosed
        fun getSettings(appId: Int): HttpResponseFor<SettingsResponse> =
            getSettings(appId, AppWebhookGetSettingsParams.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            params: AppWebhookGetSettingsParams = AppWebhookGetSettingsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            getSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            params: AppWebhookGetSettingsParams = AppWebhookGetSettingsParams.none(),
        ): HttpResponseFor<SettingsResponse> = getSettings(appId, params, RequestOptions.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            params: AppWebhookGetSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(params: AppWebhookGetSettingsParams): HttpResponseFor<SettingsResponse> =
            getSettings(params, RequestOptions.none())

        /** @see getSettings */
        @MustBeClosed
        fun getSettings(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingsResponse> =
            getSettings(appId, AppWebhookGetSettingsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same
         * as [AppWebhookService.getSubscription].
         */
        @MustBeClosed
        fun getSubscription(
            subscriptionId: Int,
            params: AppWebhookGetSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            getSubscription(subscriptionId, params, RequestOptions.none())

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            subscriptionId: Int,
            params: AppWebhookGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            getSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            params: AppWebhookGetSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = getSubscription(params, RequestOptions.none())

        /** @see getSubscription */
        @MustBeClosed
        fun getSubscription(
            params: AppWebhookGetSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>

        /**
         * Returns a raw HTTP response for `get /app-webhooks/2026-03/{appId}/subscriptions`, but is
         * otherwise the same as [AppWebhookService.listSubscriptions].
         */
        @MustBeClosed
        fun listSubscriptions(appId: Int): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(appId, AppWebhookListSubscriptionsParams.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            params: AppWebhookListSubscriptionsParams = AppWebhookListSubscriptionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            params: AppWebhookListSubscriptionsParams = AppWebhookListSubscriptionsParams.none(),
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(appId, params, RequestOptions.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            params: AppWebhookListSubscriptionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionListResponse>

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            params: AppWebhookListSubscriptionsParams
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(params, RequestOptions.none())

        /** @see listSubscriptions */
        @MustBeClosed
        fun listSubscriptions(
            appId: Int,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SubscriptionListResponse> =
            listSubscriptions(appId, AppWebhookListSubscriptionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put /app-webhooks/2026-03/{appId}/settings`, but is
         * otherwise the same as [AppWebhookService.updateSettings].
         */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: AppWebhookUpdateSettingsParams,
        ): HttpResponseFor<SettingsResponse> = updateSettings(appId, params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            appId: Int,
            params: AppWebhookUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse> =
            updateSettings(params.toBuilder().appId(appId).build(), requestOptions)

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            params: AppWebhookUpdateSettingsParams
        ): HttpResponseFor<SettingsResponse> = updateSettings(params, RequestOptions.none())

        /** @see updateSettings */
        @MustBeClosed
        fun updateSettings(
            params: AppWebhookUpdateSettingsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingsResponse>

        /**
         * Returns a raw HTTP response for `patch
         * /app-webhooks/2026-03/{appId}/subscriptions/{subscriptionId}`, but is otherwise the same
         * as [AppWebhookService.updateSubscription].
         */
        @MustBeClosed
        fun updateSubscription(
            subscriptionId: Int,
            params: AppWebhookUpdateSubscriptionParams,
        ): HttpResponseFor<SubscriptionResponse> =
            updateSubscription(subscriptionId, params, RequestOptions.none())

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            subscriptionId: Int,
            params: AppWebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse> =
            updateSubscription(
                params.toBuilder().subscriptionId(subscriptionId).build(),
                requestOptions,
            )

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            params: AppWebhookUpdateSubscriptionParams
        ): HttpResponseFor<SubscriptionResponse> = updateSubscription(params, RequestOptions.none())

        /** @see updateSubscription */
        @MustBeClosed
        fun updateSubscription(
            params: AppWebhookUpdateSubscriptionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SubscriptionResponse>
    }
}
