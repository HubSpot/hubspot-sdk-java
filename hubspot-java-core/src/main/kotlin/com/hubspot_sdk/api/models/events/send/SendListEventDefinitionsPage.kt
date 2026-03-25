// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.events.send

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.Paging
import com.hubspot_sdk.api.services.blocking.events.SendService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SendService.listEventDefinitions */
class SendListEventDefinitionsPage
private constructor(
    private val service: SendService,
    private val params: SendListEventDefinitionsParams,
    private val response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition,
) : Page<ExternalBehavioralEventTypeDefinition> {

    /**
     * Delegates to [CollectionResponseWithTotalExternalBehavioralEventTypeDefinition], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalExternalBehavioralEventTypeDefinition.results
     */
    fun results(): List<ExternalBehavioralEventTypeDefinition> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseWithTotalExternalBehavioralEventTypeDefinition], but
     * gracefully handles missing data.
     *
     * @see CollectionResponseWithTotalExternalBehavioralEventTypeDefinition.paging
     */
    fun paging(): Optional<Paging> = response._paging().getOptional("paging")

    override fun items(): List<ExternalBehavioralEventTypeDefinition> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .isPresent

    fun nextPageParams(): SendListEventDefinitionsParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                .flatMap { it._after().getOptional("after") }
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): SendListEventDefinitionsPage =
        service.listEventDefinitions(nextPageParams())

    fun autoPager(): AutoPager<ExternalBehavioralEventTypeDefinition> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SendListEventDefinitionsParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseWithTotalExternalBehavioralEventTypeDefinition = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SendListEventDefinitionsPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [SendListEventDefinitionsPage]. */
    class Builder internal constructor() {

        private var service: SendService? = null
        private var params: SendListEventDefinitionsParams? = null
        private var response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition? =
            null

        @JvmSynthetic
        internal fun from(sendListEventDefinitionsPage: SendListEventDefinitionsPage) = apply {
            service = sendListEventDefinitionsPage.service
            params = sendListEventDefinitionsPage.params
            response = sendListEventDefinitionsPage.response
        }

        fun service(service: SendService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SendListEventDefinitionsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseWithTotalExternalBehavioralEventTypeDefinition) =
            apply {
                this.response = response
            }

        /**
         * Returns an immutable instance of [SendListEventDefinitionsPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): SendListEventDefinitionsPage =
            SendListEventDefinitionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is SendListEventDefinitionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "SendListEventDefinitionsPage{service=$service, params=$params, response=$response}"
}
