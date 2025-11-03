// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.models.crm.associations.v4

import com.hubspot_sdk.api.core.AutoPager
import com.hubspot_sdk.api.core.Page
import com.hubspot_sdk.api.core.checkRequired
import com.hubspot_sdk.api.models.crm.CollectionResponseMultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.models.crm.MultiAssociatedObjectWithLabel
import com.hubspot_sdk.api.models.marketing.emails.EmailsPaging
import com.hubspot_sdk.api.services.blocking.crm.associations.V4Service
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see V4Service.list */
class V4ListPage
private constructor(
    private val service: V4Service,
    private val params: V4ListParams,
    private val response: CollectionResponseMultiAssociatedObjectWithLabel,
) : Page<MultiAssociatedObjectWithLabel> {

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabel], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabel.results
     */
    fun results(): List<MultiAssociatedObjectWithLabel> =
        response._results().getOptional("results").getOrNull() ?: emptyList()

    /**
     * Delegates to [CollectionResponseMultiAssociatedObjectWithLabel], but gracefully handles
     * missing data.
     *
     * @see CollectionResponseMultiAssociatedObjectWithLabel.paging
     */
    fun paging(): Optional<EmailsPaging> = response._paging().getOptional("paging")

    override fun items(): List<MultiAssociatedObjectWithLabel> = results()

    override fun hasNextPage(): Boolean =
        items().isNotEmpty() &&
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .isPresent

    fun nextPageParams(): V4ListParams {
        val nextCursor =
            paging()
                .flatMap { it._next().getOptional("next") }
                ._after()
                .getOptional("after")
                .getOrNull() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().after(nextCursor).build()
    }

    override fun nextPage(): V4ListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MultiAssociatedObjectWithLabel> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): V4ListParams = params

    /** The response that this page was parsed from. */
    fun response(): CollectionResponseMultiAssociatedObjectWithLabel = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [V4ListPage].
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

    /** A builder for [V4ListPage]. */
    class Builder internal constructor() {

        private var service: V4Service? = null
        private var params: V4ListParams? = null
        private var response: CollectionResponseMultiAssociatedObjectWithLabel? = null

        @JvmSynthetic
        internal fun from(v4ListPage: V4ListPage) = apply {
            service = v4ListPage.service
            params = v4ListPage.params
            response = v4ListPage.response
        }

        fun service(service: V4Service) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: V4ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CollectionResponseMultiAssociatedObjectWithLabel) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [V4ListPage].
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
        fun build(): V4ListPage =
            V4ListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is V4ListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "V4ListPage{service=$service, params=$params, response=$response}"
}
